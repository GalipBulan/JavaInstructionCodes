package day35_exception;

import java.util.Scanner;

public class C04_TryCatch {

    public static void main(String[] args) {

        /* Kullanıcıdan istedğişi kadar sayı girmesini isteyip
            Girilen sayıları toplayın
            kullanıcının işlemi bitirmek için Q'ya basmasını isteyin Q'ya basıldığında
            toplam kaç sayı girdiğini  ve bu sayıların toplamının kac  oldugunu yazdırın
         */

        Scanner scan = new Scanner(System.in);
        double grilenSayi = 0;
        double sayilarinToplami = 0;
        int sayac = 0;
        boolean devam = true;


        while (devam) {

            System.out.println("Tplanmak uzeresayi giriniz. \nitirmek icin Q'ya basin");

            grilenSayi = scan.nextDouble();

            sayilarinToplami += grilenSayi;
            sayac++;

        }
    }
}
