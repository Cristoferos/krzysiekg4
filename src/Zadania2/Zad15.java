package Zadania2;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Podaj liczbe czeków:  ");
        double min = wpis.nextDouble();

        if(min<20){

            double koszt = min*0.10+10;
            System.out.println("Koszt oplaty bankowej to: "+ koszt);

        }
        else if(min<39){

            double koszt = min*0.08+10;
            System.out.println("Koszt oplaty bankowej to: "+ koszt);

        }
        else if(min<59){

            double koszt = min*0.06+10;
            System.out.println("Koszt oplaty bankowej to: "+ koszt);

        }
        else {
            double koszt = min*0.04+10;
            System.out.println("Koszt oplaty bankowej to: "+ koszt);

        }
    }
}
