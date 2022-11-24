package day41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullanarak, listenin elementlerini sondan basa dogru yazdirin
        ListIterator lit = sayilar.listIterator();
        // once iterator'i sona goturelim.

        while(lit.hasNext()){
            lit.next();
        }

        // Simdi sondan basa dogru gidelim, giderken elementleri yazdiralim

        while(lit.hasPrevious()){
            // hasPrevious methodu ile Iterator List' in sonundan basina dogru hareket eder.
            // Ve onunde index var mi diye sorar. Sonucu true veya false dondurur.
            // hasPrevious methodu  her yazildiginda bir geri gider ve ayni islemi tekrarlar

            System.out.print(lit.previous() + " ");
            // previous() method ile Iterator ilk olarak bir geri gider ve ustunden gectigi sayiyi yuklenir.
            // DAha sonra istersek bu sayilari yazdirabiliriz

        }

        // eger iterator'i nerede biraktigimizi hatirlayamazsak
        // iterator.nextIndex() ile hangi index'in oncesinde oldugumuzu gorebiliriz
        System.out.println("");
        System.out.println(lit.nextIndex()); // 0//  Iterator sifirinci indexte konumlu.

        // iterator kullanarak, listenin tum elementlerini 5 artirin

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5);
            // next() methodu ile ilk olarak degeri getirip 5 arttirdik  daha sonra set ettik.

        }

        System.out.println(sayilar);


        // iterator kullanarak 40'dan kucuk olan elementleri silin.

        System.out.println(lit.nextIndex()); //4//Her islemden once Iterator un nerede oldugunu bilmemiz gerekir

        while(lit.hasPrevious()){

            if ((Integer)lit.previous()<40){

                lit.remove();
            }
        }

        System.out.println(sayilar);
}}
