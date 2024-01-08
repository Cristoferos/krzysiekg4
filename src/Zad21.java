import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);

        double kwotaPoLatach;
        System.out.println("Wpisz kwotę zdeponowaną: ");
        double kwotaPierwotna = wpis.nextDouble();
        System.out.println("Wpisz roczną stopę oprocentowania: ");
        double rocznaStopaOprocentowania = wpis.nextDouble();
        System.out.println("Wpisz ile lat bedą środki kapitalizowane: ");
        double doliczoneOdsetki = wpis.nextDouble();
        System.out.println("Wpisz liczbę lat przez jakie będzie kwota deponowana: ");
        double liczbaLat = wpis.nextDouble();

        double kwota1 =1+rocznaStopaOprocentowania/doliczoneOdsetki;
        double kwota2 = kwotaPierwotna * kwota1;

        System.out.println("Bedziesz posiadał " + kwota2 + " po " + liczbaLat + " latach.");
    }
}
