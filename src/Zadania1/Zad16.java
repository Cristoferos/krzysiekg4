package Zadania1;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("wpisz ulubione miasto: ");
        String miasto = wpis.nextLine();

        System.out.println(miasto.length());
        System.out.println(miasto.toLowerCase());
        System.out.println(miasto.toUpperCase());
        char pierwszaLitera = miasto.charAt(0);
        System.out.println(pierwszaLitera);





    }
}
