package day32_inheritanceConstructorCall;

public class BToyota extends Araba {

    BToyota () {  // 4

        System.out.println("Parametresiz Toyota constructor"); // 8

    }
    BToyota (int pt) {   // 14

        // 15 süper (); gormedigimiz super calisir

        System.out.println("Parametreli Toyota constructor");  // 9   // 19
    }   // 20
}
