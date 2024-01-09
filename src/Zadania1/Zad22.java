package Zadania1;

public class Zad22 {
    public static void main(String[] args) {

        double wartoscAkcji = 32.87 * 1000;
        double  wartoscProwizji = wartoscAkcji * 0.02;
        double wartoscAkcjiPo = 33.92 * 1000;
        double wartoscProwizjiPo = wartoscAkcjiPo * 0.02;

        double zysk = wartoscAkcjiPo - wartoscAkcji - wartoscProwizjiPo - wartoscProwizji;

        System.out.println("Zysk wynosi: " + zysk);
    }
}
