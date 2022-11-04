package day06_ifElseStatements;

import java.util.Scanner;

public class C01_ifStatemens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.                                         NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        System.out.println("Lutfen ay isminin ilk ismini giriniz");

        char harf= scan.next().charAt(0);

        if (harf=='o'|| harf== 'O');

        System.out.println("Ocak");

        if (harf == 'a' || harf == 'A'){
            System.out.println("Aralik,Ağustos");
        }
        if (harf == 'o' || harf == 'O'){
            System.out.println("Ocak");}
        if (harf == 'ş' || harf == 'Ş'){
            System.out.println("Şubat");}
        if (harf == 'm' || harf == 'M'){
            System.out.println("Mart,Mayıs");}
        if (harf == 'n' || harf == 'N'){
            System.out.println("Nisan");}
        if (harf == 'h' || harf == 'H'){
            System.out.println("Haziran");}
        if (harf == 't' || harf == 'T'){
            System.out.println("Temmuz");}
        if (harf == 'e' || harf == 'E'){
            System.out.println("Eylül,Ekim");}
        if (harf == 'k' || harf == 'K'){
            System.out.println("Kasım");}


    }
}
