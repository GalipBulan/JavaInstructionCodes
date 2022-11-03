package ders12_forLobs;

public class C05_DikkarEdilecekler {

    public static void main(String[] args) {

        //  Sonsuz loop calisir fakat bilgisayar cokone kadar devam eder


        for (int i = 0; i <-10; i++)

            System.out.println();


            //Ilk deger icin bitis sarti true olmuyorsa foor badisi calisir fakat devam etmez

            for (int j = 0; j >10 ; j++) {  // olu dogan loop:))

                System.out.println();

            }

        // bir loop u sonunu beklemeden bitirmek istersek

        // kullanicinin verdigi sayinin asal sayi oldugunu bulunuz

        int sayi = 100;

        boolean asalMi=false;

        int bayrak =0;



        for (int i = 2; i<=sayi-1; i++) {

            if (sayi%i==0){

                asalMi=true;

                bayrak++; // bu soru bayrak ile de cozulur bayrak basta 0 atanir her asalda bayrak 1 artar

                break; // eger loop sarti buldugunda duracaksa break yazariz, aksi halde bosuna calismis olur


            }


        }

        System.out.println("Sayi asal degildir:" + asalMi);

        System.out.println(bayrak);



    }
}
