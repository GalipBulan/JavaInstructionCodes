package day21_arrayLisst;

import java.util.ArrayList;
import java.util.List;

public class C03_contains {

    public static void main(String[] args) {

        //list.contains methodu bir degerin List icinde olup olmadigini tru veya false olarak cevirir

        List<Integer> sayilar= new ArrayList<>();

        int [] arr = {2,3,4,5,6,7,9,0,1,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);



        }

        System.out.println(sayilar.contains(3)); // true

        System.out.println(sayilar.contains(8)); //False

        System.out.println(sayilar.contains(7)); // true
    }
}
