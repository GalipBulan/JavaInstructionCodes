package day25_staticKeyword;

public class C04_passByValue {

    public static void main(String[] args) {

        double fiyat = 100; // Bu fiyatin scupe si bu main method ile sinirlidir. Baska klasda kullanamayiz

        System.out.println(indirimUygulama(fiyat)); // Methodu cagirdigimiz zaman inrim yapar

        System.out.println(fiyat); // Fakat methodu cagirmadan normal yazdirirsak normal fiyati yazar

        // Bu PassByValue dir


    }

    public static  double indirimUygulama(double fiyat ){

        // Fiyata % 10 indirim yap

        fiyat= fiyat*0.9;

        return fiyat;

    }
}
