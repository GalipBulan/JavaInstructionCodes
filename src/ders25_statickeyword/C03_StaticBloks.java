package ders25_statickeyword;

public class C03_StaticBloks {


    static {

        System.out.println("1. staticblock calisti"); // Bir klas calistiginda ilk calisan ilk sey static blok tur

        // Main method dan dahi once calisir.

    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");

    }
    static {

        System.out.println("2. staticblock calisti"); // birden fazla static block varsa ustteki once calisir
    }
}
