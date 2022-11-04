package day18_arrays;

public class C04_ArraysElementleriToplama {

    public static void main(String[] args) {

        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.


        int[] arr = {2, -3, 5, -6, 4,-8, 7};

        int toplam =0;

        for (int i = 0; i <arr.length; i++) {

            if (arr [i]>0){

                toplam += arr[i];
            }

        }

        System.out.println(toplam);


        System.out.println(pozitifElementleriTopla(arr)); // method u main method un icine cagiriyoruz
    }

    public static int pozitifElementleriTopla(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                toplam += arr[i];
            }
        }
        return toplam;
    }
}
