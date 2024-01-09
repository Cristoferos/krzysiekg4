package Zadania1;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("wpisz liczbe ciastek: ");
        int iloscCiastek = wpis.nextInt();

        int kalorieCiastka = 75;
        int kalorieCale;

        kalorieCale = iloscCiastek * kalorieCiastka;

        System.out.println("Zjedzono : " + kalorieCale + " kalori");
    }
}
