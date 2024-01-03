import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);
        String firstName, middleName, lastName;
        firstName = wpis.nextLine();
        middleName = wpis.nextLine();
        lastName = wpis.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.println(firstInitial);
        System.out.println(middleInitial);
        System.out.println(lastInitial);


    }
}
