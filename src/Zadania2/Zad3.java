package Zadania2;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Wpisz wagę");
        int waga  = wpis.nextInt();

        System.out.println("Wpisz wzrost");
        double wzrost = wpis.nextDouble();

        double bmi;
        bmi = (double)waga/Math.pow(wzrost, 2);

        if(bmi>=18.5 && bmi<=25){
            System.out.println(bmi+"waga prawidłowa");
        }else if(bmi<18.5){
            System.out.println(bmi+"niedowaga");
        }else if(bmi>25){
            System.out.println(bmi+"Nadwaga");
        }


    }
}
