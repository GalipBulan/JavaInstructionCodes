package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {


        String [] arr = {"Ali", "Ahmet", "Ulus"};

        // Bu Array in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i <arr.length; i++) {

            System.out.print(arr[i]+ " ");

        }

        // Bu array i Array olarak yazdiralim

        System.out.println(arr);  // Array bir obje/ non primitive data oldugu icin java referansi yazdirir


        // Array i array olarak yazdirmak icin Arrays klasindan  toString methodunu kullaniriz.

        System.out.println(Arrays.toString(arr)); // [Ali, Ahmet, Ulus]

        //Uygulama

        String [] arr1 = {"Arzu", "Galip","Ali"};

        arr1 [2] = "Aziz";

        System.out.println(Arrays.toString(arr1)); // [Arzu, Galip, Aziz]


    }
}
