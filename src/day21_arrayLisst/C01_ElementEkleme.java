package day21_arrayLisst;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar); // [ ] Bos bir List yazdirir

        sayilar.add(10);  // ArrayLisst Array altyapisini kullandigi icin teker teker ekleme yapilabilir

        System.out.println(sayilar); // [10]

        System.out.println(sayilar.add(10)); // true //  eklenip eklenmedigini kontrol edip true yada false bir deger dondurur.

        sayilar.add(20);

        System.out.println(sayilar); // Tersi soylenmedikce sona akler

        sayilar.add(1, 15 ); // istersek isdegimiz indexe de ekleme yapabiliriz

        System.out.println(sayilar);

        sayilar.add(0, 30 );

        System.out.println(sayilar);

        sayilar.add(3,70);

        System.out.println(sayilar);

        // Listenin basina 44 ekle

        sayilar.add(0,44);

        System.out.println(sayilar);

        List<Integer> eklenecekListe = new ArrayList<>();

        eklenecekListe.add(90);
        eklenecekListe.add(80);

        // Sayilar Listesinin sonuna eklenecek listeyi ekleyin

        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);

        // Sayilar Listesinin basindaki 44 den sonra eklenecek listeyi ekleyin

        sayilar.addAll(1,eklenecekListe);

        System.out.println(sayilar);



    }
}
