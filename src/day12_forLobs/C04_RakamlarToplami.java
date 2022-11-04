package day12_forLobs;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        // killanicinin verdigi sayinin rakamlar toplamini bulunuz



        int sayi= 548796;

        String sayiStr= ""+sayi; // sayiyi Stringe cevirdik

        int birlerBasamagi=0;

        int rakamlarToplami= 0;


        for (int i = 1; i <=sayiStr.length() ; i++) {

            birlerBasamagi=sayi%10;

            rakamlarToplami=rakamlarToplami+birlerBasamagi;

            sayi=sayi/10;


        }

        System.out.println(rakamlarToplami);

    }
}
