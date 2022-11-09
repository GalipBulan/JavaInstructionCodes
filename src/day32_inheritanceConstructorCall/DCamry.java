package day32_inheritanceConstructorCall;

public class DCamry extends  BToyota{

    DCamry (String pc) {
        // super("Deniz");
        super("Deniz");
        // CTE  Eger kullanilan paramertereye  uygun bir constructor parent clasta yoksa CTE verir

    }
    DCamry(){

    }

    public static void main(String[] args) {



        DCamry camry1 = new DCamry();

        // Burada gormedigimiz süper constructor calisir.

        // this sadece iicinde bulundugu class a bakar

        // super ise patand class a gider.

    }
}
