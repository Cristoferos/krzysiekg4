package Zadania2;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        double waga = wpis.nextDouble();
        int odleglosc = wpis.nextInt();

        if (odleglosc <= 500) {
            if (waga <= 1) {
                double cena = waga * 1.1;
                System.out.println("koszt to " + cena);
            } else if (waga >= 1 && waga <= 3) {
                double cena = waga * 2.2;
                System.out.println("koszt to " + cena);
            } else if (waga >= 3 && waga <= 5) {
                double cena = waga * 3.7;
                System.out.println("koszt to " + cena);
            } else if (waga > 5) {
                double cena = waga * 3.8;
                System.out.println("koszt to " + cena);
            }
            }
            if (odleglosc >= 550) {
                if (waga <= 1) {
                    double cena = waga * 2.2;
                    System.out.println("koszt to " + cena);
                } else if (waga >= 1 && waga <= 3) {
                    double cena = waga * 3.7;
                    System.out.println("koszt to " + cena);
                } else if (waga >= 3 && waga <= 5) {
                    double cena = waga * 3.8;
                    System.out.println("koszt to " + cena);
                } else if (waga > 5) {
                    double cena = waga * 3.8;
                    System.out.println("koszt to " + cena);
                }


            }
        }
        }
