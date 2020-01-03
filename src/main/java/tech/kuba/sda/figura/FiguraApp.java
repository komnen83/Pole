package tech.kuba.sda.figura;

import java.util.Scanner;

public class FiguraApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Wprowadz ilosc figur: ");
        int licznik = scanner.nextInt();
        Figura[] figury = new Figura[licznik];

        while (licznik > 0){
            System.out.print("Podaj figure: ");
            String figura = scanner.next();
            switch (figura) {
                case "kolo":

                    System.out.print("Podaj promien: ");
                    int promien = scanner.nextInt();
                    Kolo kolo = new Kolo(promien);
                    figury[licznik] = kolo;
                    System.out.println("Pole kola wynosi: " + kolo.obliczPowierzchnie() + "\n");
                    break;

                case "prostokat":
                    System.out.print("Podaj długość boku a: ");
                    int a = scanner.nextInt();
                    System.out.print("Podaj długość boku b: ");
                    int b = scanner.nextInt();
                    Prostokat prostokat = new Prostokat(a, b);
                    figury[licznik] = prostokat;
                    System.out.println("Pole prostokata wynosi: " + prostokat.obliczPowierzchnie() + "\n");
                    break;

                case "kwadrat":
                    System.out.print("Podaj długość boku a: ");
                    int c = scanner.nextInt();
                    Kwadrat kwadrat = new Kwadrat(c);
                    figury[licznik] = kwadrat;
                    System.out.println("Pole kwadratu wynosi: " + kwadrat.obliczPowierzchnie() + "\n");
                    break;

                default:
                    throw new RuntimeException("Miala byc figura!");
            }
            licznik--;
        }
        double suma = 0.0;
        for(Figura figura : figury) {
            suma += figura.obliczPowierzchnie();
        }
        double srednia = figury.length / suma;
        System.out.printf("srednia: %f%n", srednia);

        double najwieksza = 0.0;
        for(Figura figura : figury) {
            if(figura.obliczPowierzchnie() > najwieksza) {
                najwieksza = figura.obliczPowierzchnie();
            }
        }
        System.out.printf("Najwieksza: %f%n", najwieksza);

        double najmniejsza = najwieksza;
        for(Figura figura : figury) {
            if(figura.obliczPowierzchnie() > najmniejsza) {
                najmniejsza = figura.obliczPowierzchnie();
            }
        }
        System.out.printf("Najmnijesza: %f%n", najmniejsza);
    }
}
