package ders21_arrayLisst;

import java.util.ArrayList;
import java.util.List;

public class C05_set {

    public static void main(String[] args) {

        int[] arr = {1,2,5,2,6,4,5,7,6,3,4,7,8,5,4,3,};

        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o indexdeki degeri verdigimiz yeni deger olarak atar

        List<Integer> sayilar= new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }

        // Java'da set() u update icin kullanir
        // add() ile set() farklidir

        System.out.println(sayilar.set(0, 8));

       int eskiDeger= sayilar.set(1,9); // set ile bir degeri silip yerine yeni deger atariz

        System.out.println(eskiDeger); // yazdirirsak eski degeri de gorururz

        System.out.println(sayilar);

        sayilar.set(3,8);

        System.out.println(sayilar);



    }
}
