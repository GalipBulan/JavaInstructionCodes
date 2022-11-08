package day31_Inheritance;

import java.util.List;

public class DOtomobil extends BinekArac {

    public static void main(String[] args) {

        DOtomobil oto1 = new  DOtomobil();

        System.out.println(oto1.marka);

        // Inheritance sayesinde bir Child class olusturdugumuz zaman yeni hicbir variable veya method olusturmadan
        // parend classlar daki tum ozellikleri olmis oluruz. Child class da parent class dan gelen
        // ozellikleri update edebilir veya yeni ozellikler ekleyebiliriz.


    }

        // Java da bir class birden fazla extend edilemez. Java kabul etmez cunku hangi classa gidecegini bilemez

}
