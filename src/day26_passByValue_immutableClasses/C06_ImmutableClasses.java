package day26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        System.out.println(str.toUpperCase()); // JAVA GUZELDIR

        System.out.println(str); // Java Guzeldir

        str.toLowerCase();

        System.out.println(str); // Java Guzeldir

        // String immutable oldugu icin, method ile yapilan degisikler String'i kalici degistirmez


        List<String> harfler= new ArrayList<>();

        harfler.add("G");

        harfler.add("A");

        harfler.remove(1);

        System.out.println(harfler); // [G]

        // List ve Array mutable olduklari icin method ile yapilan degisiklikler kalici olur








    }
}
