package Zadania2;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Wpisz liczbę sekund");
        int sek = wpis.nextInt();
        int min = 0;
        int godz = 0;
        int dz = 0;
        if(sek<60){
            System.out.println(sek + " sekund" + min+ " minut"+godz+" godzin" + dz+ " dni");
        }else if(sek>86400){
            dz=+1;
            System.out.println(sek + " sekund" + min+ " minut"+godz+" godzin" + dz+ " dni");
        }else if(sek>3600){
            godz=+1;
            System.out.println(sek + " sekund" + min +" minut"+godz+" godzin" + dz+ " dni");
        }else if(sek>60){
            min=+1;
            System.out.println(sek + " sekund" + min +" minut"+godz+" godzin" + dz+ " dni");
        }
    }
}
