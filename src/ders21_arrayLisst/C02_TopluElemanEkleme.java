package ders21_arrayLisst;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemanEkleme {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        // tum sesli harfleri listeye ekleyin
        // Eklenecek tum elementleri bir Array olarak yazip sonra for loop ile listeye ekleyebiliriz

        String[] arr ={"a", "e", "i", "o", "u"}; // Array ile bu sekilde tek tek eklenebilir

        //Eklenecek tum elementleri bir array olarak yazip sonra for loop ile List'e ekleyebiliriz

        for (int i = 0; i < arr.length; i++) {

            harfler.add(arr[i]);

        }

        System.out.println(harfler);

        System.out.println(harfler.size()); // ArrayList de  size method u ile uzunlugu ogrenebiliriz

        System.out.println(harfler.isEmpty()); // false // Array listin bos mu dolu mu oldugunu verir.


    }
}
