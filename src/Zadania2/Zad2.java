package Zadania2;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Wpisz dzień");
        int day = wpis.nextInt();
        System.out.println("Wpisz miesiąc");
        int month = wpis.nextInt();
        System.out.println("Wpisz ostatnie 2 cyfry roku");
        int year = wpis.nextInt();

        System.out.println(day+"/"+month+"/"+year);
        if(day * month ==year){
            System.out.println("Data jest magiczna");
        }else{
            System.out.println("Data nie jest magiczna");
        }
    }
}
