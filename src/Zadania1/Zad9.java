package Zadania1;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);
            System.out.println("Wpisz swoje imie: ");
            String name = wpis.nextLine();

            System.out.println("Wpisz swoj wiek: ");
            int age = wpis.nextInt();

            System.out.println("Wpisz swoj oczekiwany dochod: ");
            double annualPay = wpis.nextDouble();

                System.out.println("Nazywam się " + name + ", mam " + age + " lat i chcę zarabiać " + annualPay + " rocznie.");

    }
}
