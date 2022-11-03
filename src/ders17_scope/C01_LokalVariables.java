package ders17_scope;

public class C01_LokalVariables {

    public static void main(String[] args) {

        // bir method un icinde olusturulan variableler scope' si icinde olusturulduklaru metodhdur:

        // O metodun  disindan ulasilamazlar

        int sayi = 10;

        String  isin = "Ramazan";

        for (int i = 0; i <10; i++) {

            String adres = "Ankara";

            // Bir loop icinde olusturulan variabler loop disinda kullanilamaz.

        }

        // System.out.println(adres); Bir loop icinde olusturulan variabler loop disinda kullanilamaz.

    }

    public static void method1 (){

        //System.out.println(sayi);

        // isim="tugay"

    }
}

