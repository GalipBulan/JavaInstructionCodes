package ders12_forLobs;

public class C02_ForLobs {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++)

            System.out.print(i + "  ");


            System.out.println(); // Alt satira atlamak icin yazdirdik!!!


        // iki basamakli sayilardan 7 ile bolunebilenleri yan yana yazdirin

        for (int i = 10; i < 100 ; i++) {

            if (i%7==0)

            System.out.print( i + "  ");

        }

        System.out.println();


        // 13 ten baslayarak  100 e kadar 7 ser 7 ser arttirip yaydiralim

        for (int i = 13; i <=100; i+=7) {

            System.out.print(i + "  ");


        }

        System.out.println();

        // 1 den  10'a kadar sinirlar dagil sayilarin karelerini yazdiralim

        for (int i = 1; i <=10; i++) {

            System.out.print(i*i + "  ");

        }


    }
}
