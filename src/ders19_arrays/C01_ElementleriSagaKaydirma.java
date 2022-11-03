package ders19_arrays;

import java.util.Arrays;

public class C01_ElementleriSagaKaydirma {

    public static void main(String[] args) {

        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

         int[] arr = {4,5,6,7};

         arr= sagaKaydir(arr); // method buraya kayit ediyoruz.

        System.out.println(Arrays.toString(arr));



    }

    public static int[] sagaKaydir(int[]arr){

        int bosKova = arr [arr.length-1];
        // son elementi bos kovoya koyduk kaybolmasin diye. Aksi halde son indexi
        // tekrar bulamayiz

        for (int i = arr.length-2 ; i >= 0; i--) {


            arr[i+1]= arr [i]; // Burada  arr nin ucuncu indexi ne ikinci indexi atiyoruz.



        }

        arr[0]=bosKova; // Boskovaya alinan son index i bastaki 0 index ine atiyoruz.

        return arr;

    }

}
