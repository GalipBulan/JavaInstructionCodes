package ders10_stringManipulation;

public class C01_concatenation {

    public static void main(String[] args) {

        String  str1= "Java";

        String str2 = "Güzeldir";

        boolean bl = true;

        int sayi = 20;

        double dbl = 3.54;

        System.out.println(str1+bl+sayi); // Javatrue20


        // System.out.println(str1.concat(bl)); // Srtin disindaki data turlerinde toplama yapmaya izin vermeyebilir


        System.out.println(sayi+dbl); // 23.54 double olarak yazar genis olan double oldugu icin


        System.out.println(str1.concat(" ").concat(str2)); // concet() sadece String vereable leri birlestirmek icin kullanilir


    }

    public static class Co2_contains {

        public static void main(String[] args) {

          String str = "Java ile kodlamak cok zevkli";

            System.out.println(str.contains("cok"));;

            System.out.println(str.contains("odla"));

                  // CharSequence : char dizisi

            System.out.println(str.contains("a"));

            //System.out.println(str.contains('s')); tek tirnak icinde calismaz

            System.out.println(str.contains("java")); // kucuk j ile java olmadigi icin bulamaz false yazar


            String str2 = "Java";

            System.out.println(str.contains(str2)); // true   str icinde str2 oldugu icin true


            String str3 = ("234 Ali Can");

            System.out.println(str3.contains("234"));

            System.out.println(str.contains("i,C"));




        }
    }
}
