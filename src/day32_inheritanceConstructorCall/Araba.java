package day32_inheritanceConstructorCall;

public class Araba {

    Araba(){    //%    // 16

        System.out.println("Parametresiz Araba constructor"); //6   // 17
    }    // 17

    Araba (int p1) {

        System.out.println("Parametresiz Araba constructor"); //

        // Bir constuructor da gorunmeyen bir Call var ise orada kesinlikle super () gorunmeyen constuructor vardir.
    }
}
