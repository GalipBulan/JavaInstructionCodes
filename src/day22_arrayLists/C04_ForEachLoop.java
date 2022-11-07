package day22_arrayLists;

public class C04_ForEachLoop {

    public static void main(String[] args) {

        int [] arr = {3,4,6, 5,7,8,6,5,4,3,3};

        // Bu arraydaki 5;ten buyuk tum elmentleri toplayalim.


        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>5)

            toplam+= arr[i];


        }
        System.out.println("for loop ole toplam: " +  toplam);

        // for each loop daha basit bir kurgu ile calisir
        // for each loop'a 3 seyi soylemek lazim
        // 1- Hangi data turunden degiskenler ile ugrasacaksin
        // 2- loop'un icerisinde herbir eleman geldiginde hangi islem ile islem yapilacak
        // 3- hangi array veya collection'dan eleman alacaksin

        toplam= 0;

        for (int each : arr
             ) {

            if (each>5){

                toplam+=each;
            }

        }
        System.out.println("for each loop ile tolam: " + toplam);


    }
}
