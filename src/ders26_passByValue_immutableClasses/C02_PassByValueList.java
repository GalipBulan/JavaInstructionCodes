package ders26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {

    public static void main(String[] args) {

        // bir method olusturalim ve method'da list'deki sayilari 5 artiralim
        // ve method'da listenin son halini yazdiralim

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elmentleri5Artir(sayilar); // Methodu kac defa calistirirsak her defesanda degerleri yeniden arttirir
        elmentleri5Artir(sayilar);
        elmentleri5Artir(sayilar);


        System.out.println(sayilar);

    }

    public static void elmentleri5Artir (List<Integer> sayilar){

        for (int i = 0; i <sayilar.size(); i++) {

            sayilar.set(i, sayilar.get(i)+5);


        }
        System.out.println(sayilar);
    }
}
