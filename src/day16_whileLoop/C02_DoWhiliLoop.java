package day16_whileLoop;

public class C02_DoWhiliLoop {

    public static void main(String[] args) {


        // 10,11,12 sayilarini toplayan bir while loop olusturalim


        int sayi = 10;

        int toplam = 0;

        do {

            toplam = toplam + sayi;

            sayi++;


        } while (sayi <= 12);

        System.out.println(toplam);



    }
}