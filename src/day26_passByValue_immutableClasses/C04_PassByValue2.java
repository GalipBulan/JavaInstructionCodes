package day26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValue2 {

    public static void main(String[] args) {

        // Bir method olusturalim
        // method'da yeni bir liste olusturun
        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesine deger olarak yeni list'i atayin
        // ve sayilar list'ini yazdirin

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

    }

    public static void yeniListDegeriAta(List<Integer> sayilar){

        // method'da yeni bir liste olusturun

        List <Integer> yeniList = new ArrayList<>();

        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin

        for (int i = 0; i <sayilar.size(); i++) {

            yeniList.add(sayilar.get(i) +5 );

            // sonra sayilar listesine deger olarak yeni list'i atayin

            sayilar= yeniList;

        }

       //  System.out.println("Method da sayilarin listesinin son hali= "+ Arrays.toString());

    }

}
