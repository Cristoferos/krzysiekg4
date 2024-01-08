import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        double zysk;
        double cena;
        System.out.println("Wpisz cene: ");
        cena = wpis.nextDouble();


        zysk = cena * 0.4;

        System.out.println("zysk wynosi: " + zysk);
    }
}
