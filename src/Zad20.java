import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);

        double liczbaCiastek = wpis.nextDouble();

        double mąka = 2.75 * liczbaCiastek;
        double cukier = 1.5 * liczbaCiastek;
        double masło = 1 * liczbaCiastek;

        System.out.println("Potrzebujesz " + mąka + " mąki, " + cukier + " cukru oraz " + masło + " masła ");
    }
}
