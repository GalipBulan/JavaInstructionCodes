package day10_stringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear c";

        System.out.println( str.indexOf("a")); // 9 ilk a'nin index ini dondurur

        System.out.println(str.indexOf('c')); // 8 char da String de kabul eder

        System.out.println(str.indexOf("hersey")); // 15 birden fazla harf varsa o durumda ilk harfin index ine bakilir

        System.out.println(str.indexOf("e", 9)); // 9; dan sonra baslar ilk e'yi bulur

        // 13. 13. index teki e'den bir sonraki e'nin indexini bulunuz

        System.out.println(str.indexOf("e",14)); // 13 dedigi icin onu almamali bu yuzden 14 yazariz


        // cumledeki 2. c nin indexini yazdirin

        int ilkcindex= str.indexOf("c"); // 8


        System.out.println(str.indexOf ("c" , ilkcindex+1));



        System.out.println(str.indexOf("ali")); // index olarak int dondurmesi lazim

        // olmayan bir deger icin her zaman -1 doner bu sabittir.

        System.out.println(str.indexOf("x"));




        // 3. c nin indeksini bulunuz

        int ikincicindex = str.indexOf("c",ilkcindex+1);

        System.out.println(ikincicindex);

        int ucuncindek= str.indexOf("c", ikincicindex+1);

        System.out.println(ucuncindek);




















    }
}
