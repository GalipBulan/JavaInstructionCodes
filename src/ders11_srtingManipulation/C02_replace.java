package ders11_srtingManipulation;

public class C02_replace {

    public static void main(String[] args) {


        String str = "Java candir";

        str.replace('a', 'A'); // JAvA cAndir

        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace(' ', '_'));

        System.out.println(str.replace("candir", "cok guzeldir"));

        System.out.println(str.replace(" ", ""));


        System.out.println(str.replace("Java", "Hava")

                .replace("candir", "cok guzeldir"));

        System.out.println(str.replaceFirst("a", "A"));

        System.out.println(str.replace("", "_"));

        // replace metodo char kabul eder








    }
}
