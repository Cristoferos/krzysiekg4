package Zadania2;
import  java.util.Scanner;
public class Zad8 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        int cena = 99;
        int pakiety = wpis.nextInt();
        double full = cena * pakiety;
        if (pakiety > 9 && pakiety <= 19) {
            full *= 0.2;
            System.out.println(full);
        } else if (pakiety > 19 && pakiety <= 49) {
            full *= 0.3;
            System.out.println(full);
        } else if (pakiety > 49 && pakiety <= 99) {
            full *= 0.4;
            System.out.println(full);
        } else if (pakiety > 99) {
            full *= 0.5;
            System.out.println(full);

        }
    }
}
