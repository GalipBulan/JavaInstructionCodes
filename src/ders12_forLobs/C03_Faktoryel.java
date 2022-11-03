package ders12_forLobs;

public class C03_Faktoryel {

    public static void main(String[] args) {


        // kullanicinin verdigi sayinin faktoriyelini bulalim


        int sayi = 10;

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel=faktoryel*i;

        }

        System.out.print(faktoryel);

        System.out.println();




        // 1'den 100'e kadar olan sayiyilarin toplamini bulunuz


        int toplam= 0;


        for (int i = 1; i <=100 ; i++) {

            toplam=toplam+i;




        }

        System.out.println(toplam); // toplam degerini forloop icine yazarsak ara toplam

        // degerlerinin hepsini verir




    }
}
