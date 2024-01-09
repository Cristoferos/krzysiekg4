package Zadania2;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Podaj masę");
        double masa = wpis.nextDouble();
        double ciezar = masa * 9.8;

        if(ciezar<10){
            System.out.println("Za lekki");
        }else if(ciezar>1000){
            System.out.println("Za ciężki");
        }else{
            System.out.println("Ciężar wynosi: " + (int)ciezar + " niutonów");
        }


    }
}
