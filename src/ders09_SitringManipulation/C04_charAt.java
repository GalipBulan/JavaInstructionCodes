package ders09_SitringManipulation;

public class C04_charAt {

    public static void main(String[] args) {


        String str = "Java Candir";

        System.out.println(str.charAt(0)); // ilk harfi verir

        System.out.println(str.charAt(5)); // 5. index'teki char'i verir. Boslik da bir karakterdir

        System.out.println(str.charAt(10)); // bana sonuncu karakteri yazdirir "r"

        System.out.println(str.charAt(7));


        // karakter sayisi klavyeye kac kez basiyorsak odur ve 1'den baslar.

        // bu metinde karakter sayisi 11, index 10 'dur

        // System.out.println(str.charAt(11)); indeks sinirlari disinda ise hata verir.

        // char.At() metedu icine sadece 1 tane index alir












    }
}
