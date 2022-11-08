package day31_Inheritance;

public class GCorolla extends FToyota {

    String model = "Corolla";

    String uretimYeri = "Turkiye";

    GCorolla(){

        super(); // extends kullanildiysa gizli bir super cons Call vardir.

        // Parent classdaki paremetresiz cons a git ve calistir anlamina gelir.

        System.out.println("Corolla contructoru calisti");

     }


    public static void main(String[] args) {

        GCorolla corolla1 = new GCorolla();

        System.out.println(corolla1.marka); // Toyota


    }

}
