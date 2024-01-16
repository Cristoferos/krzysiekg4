package Zadania3;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("podaj liczbe");
        int liczba = wpis.nextInt();
       while(liczba>10 && liczba<24){
           System.out.println("Liczba prawidłowa");
        break;
       }

        }
    }

