package day29_stringBuilder_accesModifier;

public class C05_AccessModifier {

    public static void main(String[] args) {

        C04_AccessModifiers obj= new C04_AccessModifiers();

        obj.isim="Tugay";
        System.out.println(obj.isim); // Tugay
        // obj.sayi=20; private variable'lara baska class'dan ulasilamaz

        C04_AccessModifiers obj2= new C04_AccessModifiers();
        System.out.println(obj2.isim); // Ali
    }
}
