package day28_varargs_stringBuilder;

public class C03_Varargs {

    public static void main(String[] args) {

        method1 (3,4,5,6,7,8 );

        isim ("ali, ahmet, huseyin, yusuf");
        
        // sayi();
        isim();

    }
    public static void method1 (int a, int b, int c,  int... sayilar) {

   }
   public static void isim (String... isimler ) {

       System.out.println(isimler.toString());

    }

     // public static void method2 (int... sayilar, int a)   hata verir.
     // Bu paratemetlere listesinde varargs parametresi listenin sonunda olmak zorundadir.
     // Bu durumda bir method da 2 tane varargs maremetre olamaz.
     // Varargs method da parametre girme acisindan cok pratiktir
}
