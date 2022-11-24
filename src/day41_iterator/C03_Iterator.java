package day41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator it1= sayilar.iterator();
        Integer element;

        while (it1.hasNext()){
            element= (Integer) it1.next();

            if (element>15 && element<35){
                it1.remove();
            }
        }

        System.out.println(sayilar);

        sayilar.add(20);
        sayilar.add(30);

        System.out.println(sayilar); // [10, 40, 20, 30]

        // Tum elementleri Iterator yardimi ile silelim.

        Iterator it2= sayilar.iterator();

        // hasNext() methodu ile Iterator List' in basina konumlanir.
        // Ve yaninda index var mi diye sorar. Sonucu true veya false dondurur.
        // hasNext() methodu  her yazildiginda bir ileri gider ve ayni islemi tekrarlar

        it2.next(); // Bu method ile Iterator ilk olarak bir ileri gider ve ustunden gectigi sayiyi yuklenir.
        it2.remove(); // Daha sonra bu sayiyi sileriz.

        it2.next();
        it2.remove();

        System.out.println(sayilar);

        // Listin tum elemanlarini silmek istersek

        while (it2.hasNext()){
            it2.next();
            it2.remove();
        }

        System.out.println(sayilar); // []

    }
}
