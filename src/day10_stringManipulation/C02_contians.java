package day10_stringManipulation;

public class C02_contians {

    public static void main(String[] args) {

        String str ="Java ile kotlamak cok zevkli";

        System.out.println(str.contains("cok")); // true

        System.out.println(str.contains("otla")); // true

        System.out.println(str.contains("a")); // true

        // System.out.println(str.contains('a')); parametre olarak char kabul etmez

        System.out.println(str.contains("java"));  // false yazdirir cunku kucuk buyuk harf duyarliligi vardir

        String str1= "Java";

        System.out.println(str.contains(str1)); // true

        String str2= " 132 Ali Can";

        // str.contains(2)  kabul etmez "" icinde yazilmak zorunda

        System.out.println(str2.contains("2")); // true  kabul eder "" icinde String olarak istenildigi icin


    }
}
