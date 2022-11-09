package day32_inheritanceConstructorCall;

public class Corolla extends BToyota{

    Corolla (int pc) {  // 12

        super (5);   // 13  // Süper her zaman parant clastaki constructor u cagirir.

        System.out.println("Parametreli Corolla constructor calisti");  /// 21

        System.out.println("========");

    }
    Corolla(){

    }
    Corolla(String str) {
        this();  // Sadece  bu klastaki String parametreli Cons u cagirir.

        System.out.println("String Parametreli Corolla constructor calisti");
    }

    public static void main(String[] args) {  // 1

        Corolla corolla1 = new Corolla();  // 2  // Default constructor calisir fakat biz gormeyiz


        // 3 super() ;

        // Parametresiz Araba constructor
        // Parametresiz Toyota constructor


        System.out.println("++++++++++");

        Corolla corolla2 = new Corolla(3);  // 11

        Corolla corolla3 = new Corolla("Galip");

    }
}
