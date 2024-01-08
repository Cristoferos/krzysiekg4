import java.util.Scanner;

public class Zad18 {
    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);

        double kwotaBezProwizji = 600 * 21.77;
        double prowizja = kwotaBezProwizji * 0.02;
        double kwotaCalkowita = kwotaBezProwizji + prowizja;

        System.out.println("Kwota bez prowizji: " + kwotaBezProwizji + ", wysokość prowizji: " + prowizja + " oraz kwota całkowita: " + kwotaCalkowita);
    }
}
