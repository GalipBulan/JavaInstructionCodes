package ders21_arrayLisst;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {

    public static void main(String[] args) {

        int[] arr = {1,2,5,2,6,4,5,7,6,3,4,7,8,5,4,3,};

        List<Integer> sayilar= new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }

        sayilar.remove(2); // 2. indexi siler

        System.out.println(sayilar);

        sayilar.remove(7); // 7. index i siler

        System.out.println(sayilar);

        /*
         Listemiz integer'lardan olusuyorsa
         biz int bir deger yazdigiizda hep index kabul ettiginden
         istedigimiz elementi obje olarak girip sildirmek icin
         onceden tanimlamamiz gerekir
         */


        Integer silinecekObje=4;

        sayilar.remove(silinecekObje);

        System.out.println(sayilar); // ilk dordu siler



        // tum 3 leri sildirin //

        silinecekObje=3;

         while (sayilar.contains(silinecekObje)){

             sayilar.remove(silinecekObje);

         }

        System.out.println(sayilar);

         silinecekObje=10;

        System.out.println(sayilar.remove(silinecekObje)); // silinecek obje yoksa false dondurur


        // sayilar.remove(20); // IndexOutOfBoundsException  index yoksa hata verir.  20. index yok cunku

        int[] silinecekListe= {2,4,5};

        // sayilar.removeAll(silinecekListe);

        System.out.println(sayilar);

        // Listedeki tum elementleri silmek icin list.clear() metdodu kullanilir

        // sayilar.clear();

        System.out.println(sayilar); // Tüm listeyi sildik






    }
}
