package ders10_stringManipulation;

public class C03_startsWith {

    public static void main(String[] args) {

        String str = "manti acarken java ogrenilmez";

        str.startsWith("Manti");

        System.out.println(str.startsWith("Manti")); // true kucuk harf cunku


        System.out.println(str.startsWith("m")); // true


        System.out.println(str.startsWith("manti acarken java ogrenilmez")); // true


        System.out.println(""); //"" hiclik isareti true yazar

        System.out.println(str.startsWith("acarken", 6 )); // true 6. indeks ve sonrasi "acarken" ile mi basliyor

        System.out.println(str.startsWith("manti", 0)); // true

        System.out.println(str.startsWith("java",10)); // false

        //System.out.println(str.startsWith("manti",0);

        //System.out.println(str.startsWith("java", ));







    }
}
