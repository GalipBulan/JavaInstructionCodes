package ders26_passByValue_immutableClasses;

public class C07_ImmutableString {

    public static void main(String[] args) {

        String str = "Java candir";

        str= str.toUpperCase();

        System.out.println(str); // JAVA CANDİR

         /*

         Immutable classlardan olusturulan bir objenin degeri degistirilemez.
         Eger atama yaparsak java degerini degistirmez bunun yerine yeni bir obje olusrurulur.
         Ve bu yeni objeye yeni atadigimiz degeri atar.
         Eski obje bosa cikar ve garbege collector ( java copcusu) tarafindan silinmeyi bekler.

          */

    }
}
