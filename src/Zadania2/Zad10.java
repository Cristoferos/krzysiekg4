package Zadania2;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);


        double kcal = wpis.nextDouble();
        double tluscz = wpis.nextDouble();


        double kcalTluscz;
        kcalTluscz = tluscz * 9;

        if(kcalTluscz > kcal){
            System.out.println("Dane wejściowe nieprawdiłowe");

        }else{
            System.out.println();

            if(kcalTluscz* 0.3 <kcal){
                System.out.println("niskotlusczowe" + kcalTluscz);

            }else{
                System.out.println("wysokotłuszczowe" + kcalTluscz);
            }

        }




    }
}
