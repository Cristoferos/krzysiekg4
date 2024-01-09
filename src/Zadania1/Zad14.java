package Zadania1;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);

        System.out.println("Wpisz wynik 1 testu: ");
        double wynik1 = wpis.nextDouble();
        System.out.println("Wpisz wynik 2 testu: ");
        double wynik2 = wpis.nextDouble();
        System.out.println("Wpisz wynik 3 testu: ");
        double wynik3 = wpis.nextDouble();

        double srednia;
        srednia =(wynik1+wynik2+wynik3)/3;

        System.out.println("wyniki pojedynczych testow: " + wynik1 + " " + wynik2 + " " + wynik3 + " oraz średnia: "+ srednia);
    }
}
