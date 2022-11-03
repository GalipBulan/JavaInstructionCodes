package ders21_arrayLisst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydanTekrarlariSilme {

    public static void main(String[] args) {

        // Verilen bir array de tekrar eden sayilari tek seferde yazacak sekilde Araayi duzenleyin

        int[] arr = {1,2,5,2,6,4,5,7,6,3,4,7,8,5,4,3,};

        // Bu soruyu array ile yapmak cok zor.Bunun yerine bu arrayin elemanlarini tek tek inceleyip tekrarsiz olarak List e atalim

        // En son listedeki elementleri iceren bir array olusturup yeni array i eski array a deger olarak atayalim


        List <Integer>tekrarsizListe= new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

           if (!tekrarsizListe.contains(arr[i])){

               tekrarsizListe.add(arr[i]);

           }

        }
        System.out.println("tekrarsiz liste: " + tekrarsizListe);

        // en son o list'deki elementleri array'e atamak gerekir
        // bunun icin once array'e yeni ve bos bir array degeri atayip
        // sonra list'deki elementleri array'e tasiyalim

        arr= new int[tekrarsizListe.size()];// [0,0,0,0,0,0,]

        for (int i = 0; i < arr.length ; i++) {

            arr[i]= tekrarsizListe.get(i); // get methodu bir indexi verince bize elementi getirir

            // isdegimiz indesteki elemente get method u ile ulasabiliriz

        }

        // array istenen hale geldi

        System.out.println("arrayin tekrarsiz hali" + Arrays.toString(arr));

    }
}
