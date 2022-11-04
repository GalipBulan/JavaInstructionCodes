package day08_ternary_switch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {


        //kullanicidan  bir sayi alalim
        // sayi pozitif ise iki katini yazdirin
        // sayi negatif ise 10 ekleyelim

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        double sayi= scan.nextDouble();

        if (sayi>0){
            System.out.println( sayi*2);
        } else {
            System.out.println(sayi+10);

        }
        System.out.println(sayi>0 ? sayi*2 : sayi+10); // Ternary


    }
}