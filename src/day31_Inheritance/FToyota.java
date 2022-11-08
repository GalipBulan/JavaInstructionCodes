package day31_Inheritance;

public class FToyota extends EAraba{

    protected String marka = "Toyota";

    protected String motor = "Toyoto araclar cevreci motor kullanir";

    protected String uretimYeri = "Uretim yeri belirtilmemis";

    protected  int hiz = 200;

    FToyota() {

        super(); // extends kullanildiysa gizli bir super cons Call vardir.

        // Parent classdaki paremetresiz cons a git ve calistir anlamina gelir.

        System.out.println("Toyota contructoru calisti");
    }


}
