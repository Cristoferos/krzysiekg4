import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);
        int kilometryNaLitr, przejechaneKilometry, litry;

        System.out.println("Proszę wpisac przejechane kilometry a nastepnie zuzyte litry paliwa: ");

        przejechaneKilometry = wpis.nextInt();
    litry = wpis.nextInt();


        kilometryNaLitr = przejechaneKilometry/litry;

        System.out.println("Kilometry przejechane na litrze to: " + kilometryNaLitr);


    }
}
