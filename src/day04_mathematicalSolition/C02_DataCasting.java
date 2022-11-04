package day04_mathematicalSolition;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        double sayi3= scan.nextDouble();

        int bolmeSonucuTamsayi= (int)(sayi1/ sayi2/ sayi3) ;

        System.out.println(bolmeSonucuTamsayi);
    }
}
