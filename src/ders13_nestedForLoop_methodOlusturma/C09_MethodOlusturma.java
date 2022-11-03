package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C09_MethodOlusturma {

    public static void main(String[] args) {

        isteToplaYAzdir();
        isteToplaYAzdir();


        // Kullanicidan 2 sayi alip bunlarin toplamini olusturan bir method olusturun


    }


    public static void isteToplaYAzdir (){

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();

        double sayi2 = scan.nextDouble();

        System.out.println(" Girilen sayilarin toplami:" + (sayi1+ sayi2));

        // Method u main method disinda olusturup calöismasi icin main method icine cagiriyoruz


    }
}
