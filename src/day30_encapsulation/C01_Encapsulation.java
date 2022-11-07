package day30_encapsulation;

public class C01_Encapsulation {

    public static void main(String[] args) {

        // Encapsulation = Data Haiding olarak da kullanilir.

        AEncapsuleClass pers1= new AEncapsuleClass();


        // pers1.hastaneIsmi="Java Hastanesi"; Private oldugu icin gorulemez.
        // pers1.hastaUcreti=10000; Private oldugu icin method gorulemez ve kullanilamaz
        // pers1.hemsireAdresi="Ankara"; private oldugundan ulasilamaz
        // pers1.hemsireIsmi="Yildiz Yildiz";

        System.out.println(pers1.getHastaneIsmi()); // Yildiz Hastanesi // Getter methodu onceden atanmis degeri getirir
        // ve gormemizi saglar.

        pers1.setHastaUcreti(500); // Buiraya bir deger yazmak sorundayiz.Sadece atama yapariz fakat yazdiramayiz.
        // Cunku setter methodu atama yapar fakat goremez


        // getter ve setter method'lari
        // bazen de erisimi sinirlandirmak icin degil
        // kullanicilarin islevi iyi anlamasi icin kullanilir

        System.out.println(pers1.getHemsireAdresi()); // önceden atanmis degeri getirip yazdiririz
        pers1.setHemsireAdresi("Istanbul"); // Set adip atama yapariz
        System.out.println(pers1.getHemsireIsmi());


    }
}
