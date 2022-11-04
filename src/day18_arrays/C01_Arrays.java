package day18_arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int[]arr1= {1,2,3,4,5}; // Array ayni data turunden birden fazla elemet barindiran yapilardir.

        // bir array in iki seye ihtiyaci vardir. Data turu ve length


        int[]arr = new int[20];  // bir array olusrurup icine kac adet element ekleyecegimizi belirtebiliriz

        // Bureaya daha sonra 20 addet int deger ekleyebiliz.

        // java bu durumda deger atamasi olarak default degerler atar



        // array in 1 elementine ulasmak ve uptade etmek istersek nasil yapariz

        System.out.println(arr1[2]); //3

        arr1[3]=20; // Array a yeni deger atayabiliz. Burada 3. indexe 20 degerini atadik bu satirdan sonra yeni deger olur

        arr1[4]= 30;


        System.out.println(arr1[3]); // 20

        System.out.println(arr1.length); // 5 //  Length array'de bir bilgidir bu sebeple yaninda bir parantez () olmaz

        // length Array de bir method degildir. Array e onceden eklenen bir bilgidir.

        // son elementi yazdirin

        System.out.println(arr1[arr1.length-1]); // son indexi yazdirma



        // array in tum elementlerini yazdirin

        for (int i = 0; i <arr1.length; i++) {

            System.out.print(arr1[i] + " ");


            // array in uzunlugu sonradan degistirilemez

            //  arr1[5]=35; Eger olmayan bir index e atama yapmak istenirsehata verir.

            //  Cunku arraye sonradan index eklemesi yapilamaz

            // Bu hata Compile Time Error CTO degil, Run time error dur. Yazdirmadan goremez

            //  ArrayIndexOutOfBoundsException


        }

    }
}
