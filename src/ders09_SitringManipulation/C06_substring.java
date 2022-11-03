package ders09_SitringManipulation;

public class C06_substring {

    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.substring( 5));// ogren isi kap

        System.out.println(str.substring(0)); //0 ve sonrasini yani hepsini yazdirir

        System.out.println(str.length()); // 19


        // son karakteri String olarak kaydedin


        // String sonHarf= ""+str.charAt(str.length()-1); sonucu char verir basina "" koyarak String yapariz

        // ama daha güzeli var:))


        String sonHarf= str.substring(str.length()-1);

        System.out.println(sonHarf); // p

        // son indexteki karakteri upper case olarak yazdirin

        System.out.println(str.substring(str.length()-1).toUpperCase()); //P


        // son uc harfi buyuk olarak yazdirin


        System.out.println(str.substring(str.length()-3).toUpperCase());

        System.out.println(str.charAt(str.length()-5));


    }
}
