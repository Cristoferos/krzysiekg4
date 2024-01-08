import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Wpisz cene posiłku: ");

        double cenaPosilku = wpis.nextDouble();
        double podatek = cenaPosilku * 0.0675;
        double napiwek = (cenaPosilku + podatek) * 0.2;
        double calkowitaCena = napiwek + podatek + cenaPosilku;

        System.out.println("Cena posiłku to " + cenaPosilku + ", podatek to " + podatek + ", napiwek to " + napiwek + "oraz całkowita cena to " + calkowitaCena);
    }
}
