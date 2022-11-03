package ders21_arrayLisst;

import java.util.Scanner;

public class C09_Fibonnaci {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayidan kucuk Fibonacci sayilarini bir liste olarak kaydedin ve yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int girilenSayi= scan.nextInt();


        if (girilenSayi<2){

            System.out.println("Fibonacci sayisi icin 0'dan buyuk tamsayi girmelisiniz");
        } else if (girilenSayi==0){

            System.out.println("Sifirdan kucuk Fibonacci sayisi yoktur");


        } else if (girilenSayi==1) {

            System.out.println("1'den kucuk tek Fibonacci sayisi vardir : 0 ");

        }

    }
}
