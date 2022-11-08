package day31_Inheritance;

public class Csuv extends BinekArac{

    public static void main(String[] args) {

        Csuv suv1 = new Csuv();

        System.out.println(suv1.marka); // Binek araclarin markasi vardir. Bu bilgiyi Perent classdan atanmis degeri getirerek aldi.
        System.out.println(suv1.model); // Binek araclarin modeli vardir
        System.out.println(suv1.motor); // Tüm araclar motor kullanir. // Arac classinda atanmis bilgiyi alip getirdi
        System.out.println(suv1.plaka); // Tum araclarin plakasi olur  // Arac classinda atanmis bilgiyi alip getirdi
        System.out.println(suv1.yakit); // Araclar farkli yakit kullanir // Arac classinda atanmis bilgiyi alip getirdi
        System.out.println(suv1.yil);   // 1990
        suv1.hiz(); // Binek araclarin hizi modele gore degisir
        suv1.teker();  // Binek araclar dort tekerlidir


        // Eger yeni deger atamazsak perend veya grandperend classinda atanmis degerleri otomatik alir
        // Eger bir Child classin ayni isimli birden cok parend clasi varsa en son olusturulana gider.
        // Bir Parand classin birden fazla Child class i olabilir fakar tersi mumkun degildir.
        // Javada olusturulan tum classlar object classa baglidir. Fakat object class hicbirine bagli degildir.
        // IS A
        // HAS A

        Csuv suv2 = new Csuv();

        // Deffault olarak olusturulmus metodlara istersek deger de atayabiliriz

        suv2.marka = "Toyota";
        suv2.model = "HRV";
        suv2.motor = "1.6";
        suv2.plaka = "06 ANK 006";
        suv2.yakit = "Benzin";
        suv2.yil = 2022;
        suv2.hiz(suv2.yakit); // Benzinli araclar en fazla 300 hiz yapar.


    }
     public  void  hiz (String yakit){

        if (yakit.equalsIgnoreCase("Benzin")){

            System.out.println("Benzinli araclar en fazla 300 hiz yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {

            System.out.println("Dizel araclar en fazla 260 hiz yapar");
        } else if (yakit.equalsIgnoreCase("Hybrid")) {

            System.out.println("Hybrid araclar en fazla 220 hiz yapar");
        }else {
            System.out.println("Yakit belli degil, max hiz soyleyemem");
        }
     }

}
