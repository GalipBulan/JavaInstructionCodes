package day21_arrayLisst;

import java.util.ArrayList;

import java.util.List;

public class C07_indexOf {

    public static void main(String[] args) {

        int[] arr = {1,2,5,2,6,4,5,7,6,3,4,7,8,5,4,3,};

        List<Integer> sayilar= new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println(sayilar.indexOf(4)); // indexOf sayinin ilk kullanildigi index i verir

        System.out.println(sayilar.lastIndexOf(5)); // lastIndexOf Son kullanilan index i bulur. soldan saymaya baslar.
    }
}
