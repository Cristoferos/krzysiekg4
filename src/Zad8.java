import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);
        int pole1;
        System.out.println("Podaj szerokosc i dlugosc 1 pokoju");
        pole1 = wpis.nextInt() * wpis.nextInt();

        int pole2;
        System.out.println("Podaj szerokosc i dlugosc 2 pokoju");
        pole2 = wpis.nextInt() * wpis.nextInt();

        int pole3;
        pole3 = 2 * 3;

        int pole4;
        pole4 = 2 * 2;

        int CalePole;
        CalePole = pole1 + pole2 + pole3 + pole4;

        System.out.println("\nPowierzchnia pierwszego pokoju to: " + pole1 +
                "\ndrugiego to: " + pole2 + "\ntrzeciego to: " + pole3 +
                "\noraz czwartego: " + pole4 +
                "\nPowierzchnia całkowita to: " + CalePole );
        Double PowierzchniaSolo;
        PowierzchniaSolo = (double)CalePole/4;
        System.out.println("Powierzchnia na 1 osobe wynosi: " + PowierzchniaSolo);
    }
}
