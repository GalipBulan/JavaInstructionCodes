package day28_varargs_stringBuilder;

public class C05_String_Builder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Jav candir.");

        System.out.println(sb.capacity()); // 26  Kapsiteyi otomatik olarak uzatir
        System.out.println(sb.length());   // 10 Uzunlugu yazar


        System.out.println(sb.reverse());  // Metni tersine cevirip yazar
        sb.reverse();

        sb.replace(0, 3, "Yaaaaa"); // Yaaaaa candir Ilk 3 degeri silip yerine atanan degeri yazar

        System.out.println(sb);

        sb.insert(13, " Bu bir yalandir" ); // Yaaaaa candir Bu bir yalandir.
        // Istedigimiz index'ten itibaren yeni bir metin ekleyebiliriz

        System.out.println(sb);










    }
}
