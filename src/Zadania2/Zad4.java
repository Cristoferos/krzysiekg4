package Zadania2;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("wpisz 1 wynik");
        double wynik1 = wpis.nextDouble();

        System.out.println("wpisz 2 wynik");
        double wynik2= wpis.nextDouble();

        System.out.println("wpisz 3 wynik");
        double wynik3 = wpis.nextDouble();

        int liczba = 3;

        double srednia = (wynik1+wynik2+wynik3)/liczba;

        if(srednia<60){
            System.out.println("1");
        }else if(srednia<69 &&  srednia>60){
            System.out.println("2");
        } else if(srednia<79 &&  srednia>70){
        System.out.println("3");
        } else if(srednia<89 &&  srednia>80){
            System.out.println("4");
        } else if(srednia>90){
            System.out.println("5");
        }
    }
}
