package day02_datatypes_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

         // Kullanicidan ismini alip buyuk harfle yazdirin

        // 1. Scan objesi olusturmak


        Scanner scan = new Scanner(System.in);

        // 2. kullanicidan ne istedigini yazmak

        System.out.println("Lutfrn adinizi giriniz");

       // 3. kullanicidan istedigimiz bilginin turune uygun  bir varieble olusturup

        // scanner metod'larindan uygun olanini kullanarak alinan degerei veriable a atayali

        String kullsniciAdi= scan.next();

        System.out.println(kullsniciAdi.toUpperCase());
    }
}
