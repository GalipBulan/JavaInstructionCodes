package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {

    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun.


        int[] arr = {1,3,6,3,8,5,7,5,2,7};


        EnBuyukEnKucukElementYazdir(arr);

    }
     public static void EnBuyukEnKucukElementYazdir(int[]arr){

        Arrays.sort(arr); // Arrays elemanlari Arrays.sort ile silaralariz. Icine siralamak istenen deger yazilir.

         // Arrays.sort array icindeki degerleri kucukten buyuge siralar.

         // Arrays.sort() method u array i Natural Order a gore siralar (Dogal siralama)


         System.out.println("En buyuk element: " + arr[arr.length-1]);

         System.out.println("En kucuk elemene: " + arr[0]);
     }
}
