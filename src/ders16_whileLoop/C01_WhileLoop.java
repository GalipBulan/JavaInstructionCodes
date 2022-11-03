package ders16_whileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {

        // 10,11,12 sayilarini toplayan bir while loop olusturalim

        int sayi = 10;

        int toplam = 0;

        while (sayi<=12){

            toplam+=sayi;

            sayi++;

        }System.out.println(toplam);


    }
}
