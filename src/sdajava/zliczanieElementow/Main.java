package sdajava.zliczanieElementow;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] tab = {4, 1, 6, 1, 1, 7, 8};
        int wynik = 0;

        Scanner wejcie = new Scanner(System.in);
        System.out.println("Podaj szukany element:");
        int n = wejcie.nextInt();


        for (int i=0; i<tab.length; i++) {
            if (n == tab[i]){
                wynik++;
            }
        }

        if(wynik>0){
            System.out.println("Ilosc elementow: " + wynik);
        }
        else {
            System.out.println("Idziesz na krekgle");
        }
    }
}
