public class Zad6 {
    public static void main(String[] args) {
        int pole1;
        pole1 = 3 * 4;

        int pole2;
        pole2 = pole1;

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
