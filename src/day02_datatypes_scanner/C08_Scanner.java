package day02_datatypes_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tamsiyiyi giriniz");

        int sayi1= scan.nextInt();

        System.out.println(" Lütfen ikinci tamsayiyi giriniz ");

        int sayi2= scan.nextInt();

        int bos;

       bos= sayi2;

       sayi2= sayi1;

       sayi1= bos;

        System.out.println(" sayi 1 in deger:" + sayi1);

        System.out.println(" sayi 2 in deger:" + sayi2);













    }
}
