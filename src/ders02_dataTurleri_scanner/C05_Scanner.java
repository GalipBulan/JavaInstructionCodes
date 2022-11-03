package ders02_dataTurleri_scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // kunnanicidan bir double sayi alip bir de int sayi alip bunalrin toplamini

        // ve carpimini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen bir ondalikli sayi giriniz");

        double ondalikliSayi = scan.nextDouble();

        System.out.println(" Lütfen bir tam siyi giriniz");

        int tamSayi= scan.nextInt();

        System.out.println ("Girilen sayilarin toplami:" + (ondalikliSayi+tamSayi));

        System.out.println ("Girilen sayilarin carpimi:" + (ondalikliSayi*tamSayi));







    }
}
