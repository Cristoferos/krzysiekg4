package Zadania1;

public class Zad19 {
    public static void main(String[] args) {

        int liczbaKonsumentow = 12467;
        double liczbaEnergetykow = 12467 * 0.14;
        double liczbaSmakCytrusowy = liczbaEnergetykow * 0.64;

        int liczbaEnergetykow2 = (int) liczbaEnergetykow;
        int liczbaSmakCytrusowy2 = (int) liczbaSmakCytrusowy;

        System.out.println(liczbaEnergetykow2 + " to liczba osob kkupujacych conajmniej jednego energetyka na tydzien oraz " + liczbaSmakCytrusowy2 + " to liczba osob preferujących smak cytrusowy");
    }
}
