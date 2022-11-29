package day41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // [10, 20, 30, 40]

        Iterator it1= sayilar.iterator();

        System.out.println(it1.hasNext()); // true
        // "hasNext()" metodunda Iterator List icinde en basa konumlanir ve bu degerin uzerinde gecerek degeri yuklenir
        // Kendinden sonra bir deger olup olmadigini true veya false olarak yazdirir.

        System.out.println(it1.next()); // 10 // "next" methodu ile Iteratorun yuklendigi degeri yazdiririz.

        System.out.println(it1.hasNext()); // true
        System.out.println(it1.next()); // 20

        System.out.println(it1.hasNext()); // true
        System.out.println(it1.next()); // 30

        System.out.println(it1.hasNext()); // true
        System.out.println(it1.next()); // 40

        System.out.println(it1.hasNext()); // false


        System.out.println("=============");


        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        // iterator nereye kadar iterate ettiysek orada kalir
        // bastan itibaren yazdirmak isterseniz, yeni bir iterator olusturmaniz gerekir

        Iterator it2= sayilar.iterator();
        System.out.println("=========");

        while(it2.hasNext()){
            System.out.println(it2.next());
        }


    }
}
