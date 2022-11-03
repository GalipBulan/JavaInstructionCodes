package ders06_ifElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatemens {

    public static void main(String[] args) {

        /* Kullanicidan bir ucgenin 3 kenar uzunlugunu aliniz.
        Kenar uzunlulari 0 veya negatif ise "Gecersiz kenar uzunlugu" yazdirin
        Ucgen eskenar ise "Eskenar ucgen" degilse "Eskenar ucgen degildir" yazdirin

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfrn ucgenin 3 kenar uzunlugunu giriniz");

        int kenar1= scan.nextInt();

        int kenar2 = scan.nextInt();

        int kenar3 = scan.nextInt();

        if (kenar1<=0  && kenar2<=0   &&   kenar3<=0){

        System.out.println("Gecersiz kenar uzunlugu");

        } else if (kenar1==kenar2 && kenar2==kenar3) {

            System.out.println("Eskenar ucgen");


        } else{
            System.out.println("Eskenar ucgen degildir");}


    }
}
