package ders27_immutableClasses_DateAndTime;

public class C02_StringPool {

    public static void main(String[] args) {

        String str1 = "Java"; // Bu sekilde basit String olusturmalarda Jaca Strin havuzunu kontrol eder
        // Bire bir ayni String i bulursa yeni obje olusturmaz bir objeyi birden fazla referans point eder

        String str2 = "Java";

        String str3 = new String("Java"); // Bu sekilde olusan String'lerde once esitligin sag tarafina bakilir

        // new keyword'u oldugu icin yeni obje ve yeni referas olusrurulur.

        String str4="";

        str4= str4.concat("Java");

        String str5="Ja";

        str1= str3.concat(" Guzeldir");

        System.out.println(str1);

        str5=str5.concat("va");

        System.out.println(str1.equals(str2)); // true

        System.out.println(str1==str2); // true

        System.out.println(str1.equals(str3)); // true

        System.out.println(str1==str3);//false

        System.out.println(str1.equals(str4)); // true

        System.out.println(str1==str4); // false

        System.out.println(str1.equals(str5)); // true

        System.out.println(str1==str5); // false

        System.out.println(str1=="Java"); //true // Obje olusturmadan da karsilastirma yapabiliriz. Havuzdan bulup kontrol eder

        System.out.println(str3=="Java"); // false // str3 basit sekilde olusturulmadigi icin havuzda bulamaz false verir.

        /*
          == 'in true vermesi icin hem referance hem de adress ayni olmalidir
          equals() ise sadece degerlere bakar, dolayisla supriz yasamazsiniz
         */
    }
}
