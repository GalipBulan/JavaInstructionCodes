package day02_datatypes_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Soru 4 : kullanicidan bir dirtdorgen alip 2 kenarinin uzunlugunu alip

        // dikdortgenin alanini yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen dikdortgenin iki kenar uzunlugunu giriniz"+

                "\n iki kenar uzunlugu arasinda enter e basiniz ");


        double kenar1= scan.nextDouble();

        double kenar2 = scan.nextDouble();


        System.out.println("Dikdotgenin alani:"+ kenar1*kenar2);


    }
}
