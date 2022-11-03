package ders03_datacastingWrapperClass;

public class C01_DataCasting {

    public static void main(String[] args) {

        String str = "20"; // tirnak ici oldugu icin srting sayi kabul eder

        // bazi data turleri asla birbirine cast edilemez

        // String str=20;

        //boolean mutluMu = "true";

        //  int a = true;

        // dar data turunden bir degeri genis data turundeki variabl'a atama yapinca hic sorun cikmaz

         double s = 20;

         int sayi =15;

         long ln = sayi;

         short sh = 23;

         int a = sh;

         long lng = sh;

         float fl = lng;

        // dar data turunden degeri genis data turune atarsak java
        // sorun cikarmadan yapar. Ama tersini yapmak istersek. buyuk data türündeki bir degeri kucuk data
        //turundeki variabl'a atarsak java kabul etmez


        double dbl = 20;

        //a = dbl

        //short abc = dbl;

    }
}
