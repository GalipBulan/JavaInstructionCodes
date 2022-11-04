package ders26_passByValue_immutableClasses;

public class C01_PassByValue {

    public static void main(String[] args) {

        double fiyat = 100; // Bu fiyatin scupe si bu main method ile sinirlidir. Baska klasda kullanamayiz

        System.out.println(indirimUygulama(fiyat)); // 90  Methodu cagirdigimiz zaman inrim yapar
        System.out.println(indirimUygulama(fiyat)); // 90
        System.out.println(indirimUygulama(fiyat)); // 90

        System.out.println(fiyat); // 100  Fakat methodu cagirmadan normal yazdirirsak normal fiyati yazar.

        // Bu PassByValue dir // Kopya variable uzerinde yapilacak degisikler asil variable yi etkilemez.


        // Eger method icinde yapilan degisikligin main method icin de
        // gecerli olmasini istersek main method icerisinde atama yapmamiz gerekir.

        fiyat = indirimUygulama(fiyat);

        System.out.println(fiyat); // 90


    }

    public static  double indirimUygulama(double fiyat ){

        // Fiyata % 10 indirim yap

        fiyat= fiyat*0.9;

        return fiyat;

    }
}
