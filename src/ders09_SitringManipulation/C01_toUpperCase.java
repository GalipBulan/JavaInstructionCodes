package ders09_SitringManipulation;

import java.util.Locale;

public class C01_toUpperCase {

    public static void main(String[] args) {

        String str = " Java Mutluluktur";

        System.out.println(str.toUpperCase());

        str= str.toUpperCase(); // JAVA MUTLULUKTUR

        str = "ince mehmet";

        str = str.toUpperCase();

        System.out.println(str);

        str= str.toLowerCase();

        System.out.println(str);

        System.out.println(str.toLowerCase(Locale.GERMAN));

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));

        str = str.toUpperCase();

        System.out.println(str);

    }
}
