package Zadania2;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);


        System.out.println("Podaj liczbe zkupionych ksiązek:  ");
        double min = wpis.nextDouble();

        if (min == 0) {


            System.out.println("Otrzymujesz 0 punktów: " );

        } else if (min == 1) {


            System.out.println("Otrzymujesz 5 punktów: " );

        } else if (min == 2) {


            System.out.println("Otrzymujesz 15 punktów: " );

        } else if (min == 3) {

            System.out.println("Otrzymujesz 30 punktów: ");
        }else{
            System.out.println("Otrzymujesz 60 punktów: " );

        }
    }
}