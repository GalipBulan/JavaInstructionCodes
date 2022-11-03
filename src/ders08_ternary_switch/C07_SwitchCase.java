package ders08_ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase {

    public static void main(String[] args) {

        // J : Java
        // D : Devolepment
        // K : Kit
        // Kullanicidan bir harf alin
        // alinan harf J, D, K 'dan biri ise yukaridaki kelimeleri yazdirin
        // bu harflerden biri degilse "Gecersiz harf" yazdirin

        System.out.println("Lütfen bir harf giriniz");

        Scanner scan = new Scanner(System.in);

        char harf = scan.next().charAt(0);

        switch (harf){

            case 'J':

            case 'j':

                System.out.println("Java");

                break;

            case 'D':

            case 'd':

                System.out.println("Devolepment");

                break;

            case 'K':

            case 'k':

                System.out.println("Kit");

                break;

            default:

            System.out.println("Gecersiz harf");


        }

    }
}
