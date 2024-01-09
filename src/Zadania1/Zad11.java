package Zadania1;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);
        System.out.println("wpisz cenę produktu: ");
        double wartoscProduktu = wpis.nextInt();
        double podatekStanowy = wartoscProduktu / 0.02;
        double podatekLokalny = wartoscProduktu / 0.04;
        double cenaProduktu = wartoscProduktu - podatekStanowy - podatekLokalny;
            System.out.println("Wartość produktu: " + wartoscProduktu + ",podatek stanowy: " + podatekStanowy + ",podatek lokalny: " + podatekLokalny + ", cena całkowita: " + cenaProduktu);
    }
}
