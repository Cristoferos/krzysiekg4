package Zadania1;

import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("podaj dlugosc rzedu ");
        double dlugosc = wpis.nextInt();

        System.out.println("podaj dlugosc miejsca zajmujacej kratki ");
        double kratka = wpis.nextInt();

        System.out.println("podaj odleglosci miedzy sadzonkami ");
        double sadzonka1 = wpis.nextInt();

        double sadzonka = (dlugosc-2*kratka) /sadzonka1;

        System.out.println("W rzędzie zmieści się: " + sadzonka + " sadzonek");
    }
}
