package ders26_passByValue_immutableClasses;

public class C06_ImmutableClasses {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        System.out.println(str.toUpperCase()); // JAVA GUZELDIR

        System.out.println(str); // Java Guzeldir

        str.toLowerCase();

        System.out.println(str); // Java Guzeldir








    }
}
