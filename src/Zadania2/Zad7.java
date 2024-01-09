package Zadania2;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        String imie1 = wpis.nextLine();
        String imie2 = wpis.nextLine();;
        String imie3= wpis.nextLine();;
        String imie4 = wpis.nextLine();;


        if (imie1.compareToIgnoreCase(imie2) < 0){
            System.out.println(imie1 );
        }else {
            System.out.println(" ");
        }
        if (imie2.compareToIgnoreCase(imie1) > 0){
            System.out.println(imie2 );
        }else {
            System.out.println(" ");

        }if (imie4.compareToIgnoreCase(imie3) > 0){
            System.out.println(imie4 );
        }else {
            System.out.println(" ");
        }

        }




        }



