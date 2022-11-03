package ders06_ifElseStatements;

public class C06_IfElseStatemens {

    public static void main(String[] args) {

        /*
          if else statement'da { } kullanmazsak
          hem if body'si hem de else body'si icin sadece 1 satir kabul eder
          sonraki satirlar if-else ile ilisiklendirilmez
          her durumda calisir
         */

        int not= 45;

        if (not>=50) {

            System.out.println("sinifi gectin");}

        else {

            System.out.println("Bu dersten kaldin");}

            {System.out.println("Yaz okuluna bekleriz :) ");} // Bu bolum if veya else bady si ile hic ilgili degil
    }
}
