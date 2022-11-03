package ders09_SitringManipulation;

public class C05_length {

    public static void main(String[] args) {

        String str = "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());


        System.out.println(str.charAt(33));  // u // son karakteri  yazdirin

        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek icin kullanilir.


        System.out.println(str.charAt(str.length()-3)); // Sondan 3. karakteri yazdirin


    }
}
