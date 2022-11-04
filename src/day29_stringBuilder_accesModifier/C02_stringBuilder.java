package day29_stringBuilder_accesModifier;

public class C02_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("java cok guzeldir");

        System.out.println(sb1.reverse()); // ridlezug koc avaj

        System.out.println(sb1); // StringBuildir bir yöntem ile yazdirilirsa o deger kalici olur.

        sb1.reverse();  // tekrar geri haline cevirmek icin tekrar tanimlama yapmamiz gerekir.

        System.out.println(sb1);   // java cok guzeldir

        StringBuilder sb2 = new StringBuilder("Java candir");

        String str = "Java candir";

        System.out.println(sb1==sb2); // icerik ayni olsa bile false verir.
        System.out.println(sb1==sb1); //true sadece bir sb kendisiyle karsilastirilinca true verir.
        // System.out.println(sb1==str);  farkli iki data turu == ile karsilastirilamaz.

        System.out.println(sb1.equals(sb2)); // icerik ayni olsa bile false verir.
        System.out.println(sb1.equals(sb1)); //true sadece birr sb kendisiyle karsilasrieinca true verir
        System.out.println(sb1.equals(str)); // false CTE vermez fakat sonuc her zaman false olur.


        System.out.println(sb1.compareTo(sb2));


    }
}

