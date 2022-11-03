package ders23_constructor;

public class HArabaRanner {
    public static void main(String[] args) {

        HAraba arb1= new HAraba();

        arb1.marka= "Fiat";
        arb1.model= "Linea";
        arb1.yakit= "Bezin";
        arb1.yil=2020;
        arb1.fiyat=100000;

        HAraba arb2= new HAraba("Honda", "Civic", "Benzin", 2011, 11000 );

        System.out.println(arb2);

        HAraba arb3= new HAraba("Wolkwagen", "Golf", "Benzin", 2011, 8000);

        System.out.println(arb3);

        HAraba arb4= new HAraba("Opel", "Zafira", 2023);

        System.out.println(arb4); // Atama yapilmayan degerlere en bastaki default degerleri gonderir

        HAraba arb5=new HAraba("mercedes", "B200" ,"lpg" , 2020, 100000);

        System.out.println(arb5);






    }



}
