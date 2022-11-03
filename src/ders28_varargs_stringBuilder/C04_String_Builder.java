package ders28_varargs_stringBuilder;

public class C04_String_Builder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        // En fazla 16 karakter alan bir SB olusur
        System.out.println(sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder("Ali Yilmaz");
        // Kaptise Ali Yilmaz olan bir SB olusturur ve
        System.out.println(sb2.capacity()); // 26


        StringBuilder sb3 = new StringBuilder(7);
        // Bu kod yazildiginda 7 karakter alabilecek bir SB olusur
        System.out.println(sb3.capacity()); // 7

        System.out.println(sb3.length()); // 0 yazar cunku hicbir deger atamadik.

        sb3.append("yilmaz");
        System.out.println(sb3.length()); // degeri yilmaz ve uzunlugu 6'dir

        sb3.append("Yilmaz okula gidiyor");
        System.out.println(sb3.length()); // 26 Daha uzun bir deger atamamiz durumunda java atanan uzunlugu otomatik olarak uzatir.

        // Kapasite ve length i esitlemek istersek

        sb3.trimToSize(); // methodunu kullaniriz

        System.out.println(sb3.capacity()); // capacity 26
        System.out.println(sb3.length());   // length 26







    }
}
