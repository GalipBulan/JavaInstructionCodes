package day10_stringManipulation;

public class C05_Soru {

    public static void main(String[] args) {

        /*
            mail kontrolu yapan bir program hazirlayin
            1- mail @ isareti icermiyorsa "gecersiz email"
            2- @gmail.com icermiyorsa "gmail adresi giriniz"
            3- @gmail.com ile bitmiyorsa "yazim hatasi"
            seklinde sonuc yazdirin
         */

        String mail = "malatya@gmail.com";

        if (!mail.contains("@")) {

            System.out.println("gecersiz mail");

        } else if (!mail.contains("@gmail.com")) {

            System.out.println("mail adresi giriniz");

        } else if (!mail.endsWith("@gmail.com")) {

            System.out.println("yazim hatasi");

        } else {

            System.out.println("mail basari ile kaydedildi");

        }

    }
}
