package ders06_ifElseStatements;

import java.util.Scanner;

public class C02_ifStatemens {

    public static void main(String[] args) {

        // kullanicidan bir ucgenin kenar uzunlugunu aliniz ucgen eskenar ise
        // "Eskenar Ucgen" yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lutfen ucgenin uc kenar uznlugunu giriniz");

        int kenar1= scan.nextInt();

        int kenar2= scan.nextInt();

        int kenar3= scan.nextInt();

        if (kenar1==kenar2  && kenar2==kenar3){

            System.out.println(" Eskenar Ucgen");


        }




    }
}
