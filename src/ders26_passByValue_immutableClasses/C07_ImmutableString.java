package ders26_passByValue_immutableClasses;

public class C07_ImmutableString {

    public static void main(String[] args) {

        String str = "Java candir";

        str= str.toUpperCase();

        System.out.println(str); // JAVA CANDİR

         // Immutable classlardan olusturulan bir objenin degeri degistirilemez
         // eger atama yaparsak java degerini degistirmez bunun yerine yeni bir obje olusrurulur
         // ve bu yeni objeye yeni atadigimiz degeri atar.
         // Eski obje bosa cikar ve garbere collector ( java copcusu) tarafindan silinmeyi bekler


    }
}
