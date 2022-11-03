package ders08_ternary_switch;

public class C03_Ternary {

    public static void main(String[] args) {

        int a =8;

        // a%2==0 ? "cift sayi" : "tek sayi";

        // Teranry oparotöru tek basina yazilamaz. Cunku bize sonuc uretir.

        // bunu dogrudan yazditmak veya istersek atama yapmaliyiz


        String sonuc = a%2==0 ? "cift sayi" : "tek sayi";

        System.out.println(sonuc);


        String sonuc2 = a>10 ? "buyuk sayi"  :  ""+2*a ; // CTE vermemesi icin Strin'e cevirdik

        // Tearny nin sonucunu bir variable atayacaksak true veya felse
        // durumunda uretilecek sonucun ayni data turune
        // olmasi gerekir. Aksi halde CTE hatasi verir.


        System.out.println(a>10 ? "buyuk sayi"  :  +2*a);

        // ama atama yapmadan sout direkt yazdirabiliz.

        //Sonuclarin ayni data turunde olma sarti yoktur.

    }
}
