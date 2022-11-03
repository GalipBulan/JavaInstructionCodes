package ders09_SitringManipulation;

public class C03_equalsIgnorCase {

    public static void main(String[] args) {


        String str1 = "Ali";

        String str2 = "ali";

        String str3 = "ALI";

        System.out.println(str1.equals(str2)); // false

        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.equalsIgnoreCase(str3)); // true

        System.out.println(str1.equalsIgnoreCase("Ali ")); // false verir cunku arada bosluk var

        // equalsIgnoreCase ayni metnin buyuk kucuk olarak olusturulan farkli yazimlarini birbirine esit kabul eder

        // ali, Ali, ALI, aLi, aLI hepsi birbirtine esittir.

        // Ama kelimede bosluk varsa bunlari kabul, tolere etmez.


    }
}
