package day29_stringBuilder_accesModifier;

public class C03_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("java ne kadar guzel");

        System.out.println(sb.substring(4));

        System.out.println(sb); // Kullanilan method String oldugu icin StrinBuiuldir Strin ozelliklerini alir.

        // Atama yapilmadikca kalici bir deger olmaz cunku String Immutibul data turudur.



    }
}
