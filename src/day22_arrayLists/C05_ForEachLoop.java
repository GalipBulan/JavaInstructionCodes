package day22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {

    public static void main(String[] args) {


        // Verilen String bir arrad deki her bir elemanlari kontrol edip,
        // Kelimelerin uzunlugu cift sayi ise ilk yarisini,
        // Kelimelerin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyelim

        String[] arr = {"Galip", "Ahmet", "Yilmaz", "Onur", "Aysun"};
        List<String> yeniList = new ArrayList<>();

        for (String each : arr

        ) {

            if (each.length() % 2 == 0) {

                yeniList.add(each.substring(0, each.length() / 2));


            } else {  // uzunlugu tek ise

                yeniList.add(each.substring((each.length() - 1) / 2));


            }


        }

        System.out.println(yeniList);


    }
}