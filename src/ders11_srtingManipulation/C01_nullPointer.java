package ders11_srtingManipulation;

import java.util.Locale;

public class C01_nullPointer {

    public static void main(String[] args) {


        String str= ""; // deger atanmistir fakat yazdirinca akranda birsey cikmaz

        System.out.println("");

        System.out.println(str.concat("Java"));  // Java


        String str2; // olusturuldu fakat deger atanmadi, yazdirilamaz CTE hatasi verir

        // System.out.println(str2.concat("Java")); ddeger atanmadigi icin bir bir konket ile kullanilamaz

        str2= "Java candir";

        System.out.println(str2);

        System.out.println(str2.concat("."));


        String str3=null;  // deger atanmamistir. null pointer ile deger atamadigimizi belirtiyoruz

        System.out.println(str3);

        // System.out.println(str3.concat("Java")); // NullPointerException verir

        // deger atanmis olarak gordugu icin kodu calisir durumda tutar fakat bir deger yoktur.

        System.out.println(str3 +"java");

        //System.out.println(str3.toUpperCase(Locale.ROOT)); herhangi bir Srting methodu kullanilamaz hata verir


    }
}
