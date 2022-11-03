package ders11_srtingManipulation;

public class C05_repeat_trim {

    public static void main(String[] args) {

        String str = "Java guzeldir  ";

        System.out.println(str.repeat(4));


        str= "    java guzeldir    ";

        System.out.println(str.length());

        str = str.trim();

        System.out.println(str);

        System.out.println(str.length());




    }
}
