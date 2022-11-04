package day02_datatypes_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        // Soru 3:  kullanicidan ismini, soy ismini ve yasini alip alt alta yazdirin

        // Kaydiniz basari ile tamamkanmistir yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen adinizi giriniz" );

        String isim = scan.nextLine();


        System.out.println(" Lütfen soyadinizi giriniz" );

        String soyisim = scan.nextLine();


        System.out.println(" Lütfen yasinizi giriniz" );

        double yas = scan.nextDouble();

        System.out.println(" Isminiz:" +isim +
                "\n Soyisminiz: "+ soyisim+
                "\n Yasiniz: "+ yas+ "\nKaydiniz basari ile tamamlanmistir");











    }
}
