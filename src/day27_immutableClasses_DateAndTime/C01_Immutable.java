package day27_immutableClasses_DateAndTime;

public class C01_Immutable {

    public static void main(String[] args) {

        // Bu kod calistiginda Java kac obje olusturur ?

        String str= "Ali";

        for (int i = 0; i <10 ; i++) {

            str+=".";

        }

        System.out.println(str);

        // Java her atama yapildiginda onceki yeni bir obje olusturur ve bu objeyi point eder. Onceki pointerleri siler

    }
}
