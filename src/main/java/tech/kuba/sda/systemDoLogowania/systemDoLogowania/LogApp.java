package tech.kuba.sda.systemDoLogowania.systemDoLogowania;

import java.util.ArrayList;
import java.util.Scanner;

public class LogApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<User> user = new ArrayList<>();
        LogSystem loginSystem = new LogSystem(user);

        user.add(new User("John", "Doe", "JohnD", "johndoe"));
        user.add(new User("Bob", "Geldof", "BobG", "bobgeldof"));
        user.add(new User("Nick", "Mason", "NickM", "nickmason"));
        user.add(new User("Tom", "Jones", "TomJ", "tomjones"));

        try {
            System.out.print("Login: ");
            String login = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();
            loginSystem.login(login, password);
        } catch (IllegalArgumentException | UnknownUserException | InvalidPasswordException iaex) {
            iaex.printStackTrace();
        } finally {
            System.out.println("===============");
        }
    }
}
