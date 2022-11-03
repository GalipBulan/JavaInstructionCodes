package ders26_passByValue_immutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {

        int[] arr = {3,4,5};

        elmentleri5Artir(arr);
        elmentleri5Artir(arr);
        elmentleri5Artir(arr);

        System.out.println(Arrays.toString(arr));


    }
    public static void  elmentleri5Artir (int[] arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] +5;


        }

        System.out.println(Arrays.toString(arr));
    }
}
