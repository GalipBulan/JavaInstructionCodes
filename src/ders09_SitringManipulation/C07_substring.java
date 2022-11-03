package ders09_SitringManipulation;

public class C07_substring {

    public static void main(String[] args) {

         String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5, 8));   // gun

        System.out.println(str.substring(9, 17 ));  // gectikce

        System.out.println(str.substring(3,7));    // a gu




        String isim = "HASAN";

        System.out.println(isim.substring(0,1).toUpperCase() + // ilk harfi alip buyuk yaptik

                           isim.substring(1).toLowerCase()); // 1. index ve sonrasini ali kucuk harf yaptik

        // Verilen ismi ilk harfi buyuk, geriye kalanlari kucuk yazdirin

        isim  = isim.substring(0,1).toUpperCase()+

                isim.substring(1).toLowerCase();

        System.out.println(isim);

        System.out.println(isim.substring(2,5)); // san




        // sadece 3. karakterdeki harfi  buyuk yazdirin

        System.out.println(isim.substring(3,4).toUpperCase());

        System.out.println ("Zor sorunun cevabi:"+ isim.substring(2,2));// hiclik yazdirir


        //System.out.println(isim.substring(5,2));

        //geriye dogru yazdirma olmaz, hata verir

        //StringIndexOutOfBoundsException





    }
}
