package day24_constructor;

public class ArabaRunner {

    public static void main(String[] args) {

        // Onceki class da farkli parametreleri olan constructorlar olusturduk.
        // Runner classinda istedigimiz parametler olan constructor lari kullanarak yeni
        // objeler olusturabiliriz.
        // Burada deger atanmayan objeler icin otomatik default degerler yazdirilir.

        Araba arb1 = new Araba();

        // Istersek tek tek bu sekilde de her parametreyi cagirip deger atayabiliriz
        // Ya da onceki class dan constrocturu cagirip parantez icinde daha kolay deger atayabiliriz

        arb1.marka = "Citroen";
        arb1.model = "C3";
        arb1.yakit = "Benzin";
        arb1.yil = 2020;
        arb1.fiyat = 20000;

        System.out.println(arb1);


        Araba arb2 = new Araba("Volvo", "CX60");
        System.out.println(arb2);

        Araba arb3 = new Araba("Hyundai", "i10", 10000);
        System.out.println(arb3);

        Araba arb4 = new Araba("Porche", "cayanne", "lpg", 1990, 12000);
        System.out.println(arb4);

        Araba arb5 = new Araba("BMW" , "520d");
        System.out.println(arb5);

    }
}
