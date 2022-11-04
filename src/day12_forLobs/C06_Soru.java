package day12_forLobs;

public class C06_Soru {

    public static void main(String[] args) {

        int sayi=270;

        for (int i = 1; i <=sayi; i++) {

            if (i%3==0 && i%5==0){

                System.out.print("FizzBuzz\n");

            } else if (i%3==0) {

                System.out.print("Fizz  ");

            } else if (i%5==0) {

                System.out.print("Buzz  ");

            }else {
                System.out.print(i + " ");
            }

        }


    }
}
