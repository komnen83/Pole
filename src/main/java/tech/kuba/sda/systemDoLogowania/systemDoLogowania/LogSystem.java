package tech.kuba.sda.systemDoLogowania.systemDoLogowania;

import java.util.ArrayList;

public class LogSystem {

    private ArrayList<User> user;

    LogSystem(ArrayList<User> user) throws IllegalArgumentException {
        this.user = user;
        for(User users : user) {
            if (users == null) {
                throw new IllegalArgumentException("Nie znaleziono uzytkownika");
            }
        }
    }

    public ArrayList<User> login(String uzytkownik, String haslo) throws InvalidPasswordException, UnknownUserException {
        if (user.toString().contains(uzytkownik) && user.toString().contains(haslo)) {
            System.out.println("Uzyskano dostep");
        } else if (!user.toString().contains(uzytkownik)) {
            throw new UnknownUserException("Nieprawidlowy login");
        } else if (!user.toString().contains(haslo)) {
            throw new InvalidPasswordException("Nieprawidlowe haslo");
        }
        return user;
    }
}
