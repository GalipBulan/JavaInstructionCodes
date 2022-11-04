package day10_stringManipulation;

public class C10_isEmpty {

    public static void main(String[] args) {

        String str = "";

        System.out.println(str.isEmpty());

        str = "    ";

        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank());  // true


        str = "x";

        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank()); // false
    }
}
