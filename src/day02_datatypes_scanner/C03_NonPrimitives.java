package day02_datatypes_scanner;

import java.util.Locale;

public class C03_NonPrimitives {

    public static void main(String[] args) {

        String isim = "Ali Akpinar";

        System.out.println(isim.toLowerCase(Locale.ROOT));

        System.out.println(isim.toUpperCase());

        // non primitive data turleri deger yaninda hazir metod da barindirir

        // java tarafindan sinirlandirilmamistir

        // bankadaki hesaplari tututugum uygulama

        int birinciHesap= 100;

        int ikinciHesap= 100;

        int ucuncuHesap = 100;

        System.out.println(ucuncuHesap);

        System.out.println(birinciHesap+ikinciHesap+ucuncuHesap);



    }
}
