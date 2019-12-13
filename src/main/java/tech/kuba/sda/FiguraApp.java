package tech.kuba.sda;

import java.util.Scanner;

public class FiguraApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj ilosc figur: ");
//        int numbersOfFigure = scanner.nextInt();

        System.out.print("Podaj figure: ");
        String figura = scanner.nextLine();

        switch (figura) {
            case "kolo":

                System.out.print("Podaj promien: ");
                int promien = scanner.nextInt();
                Kolo kolo = new Kolo(promien);
                scanner.nextLine();
                System.out.println("Pole kola wynosi: " + kolo.obliczPowierzchnie() + "\n");
                break;

            case "prostokat":
                System.out.print("Podaj długość boku a: ");
                int a = scanner.nextInt();
                System.out.print("Podaj długość boku b: ");
                int b = scanner.nextInt();
                Prostokat prostokat = new Prostokat(a, b);
                System.out.println("Pole prostokata wynosi: " + prostokat.obliczPowierzchnie() + "\n");
                break;

            case "kwadrat":
                System.out.print("Podaj długość boku a: ");
                int c = scanner.nextInt();
                Kwadrat kwadrat = new Kwadrat(c);
                System.out.println("Pole kwadratu wynosi: " + kwadrat.obliczPowierzchnie() + "\n");
                break;
        }
    }
}
