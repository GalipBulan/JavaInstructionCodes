package ders11_srtingManipulation;

public class C03_replaceAll {

    public static void main(String[] args) {

        String str = "J1ava2 G9uzel5dir8";

        System.out.println(str);

        System.out.println(str.replace("J1ava2 G9uzel5dir8", "Java guzeldir"));


        System.out.println(str.replaceAll("\\d" , ""));

        System.out.println(str.replaceAll("\\D", ""));


        String s1 = "";

        // replaceAll metodu char kabul etmez




    }
}
