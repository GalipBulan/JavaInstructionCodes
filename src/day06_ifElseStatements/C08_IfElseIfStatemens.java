package day06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatemens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        double not = scan.nextDouble();


        if (not>=85){
            System.out.println( "Notunut AA");

        } else if (not>=70) {
            System.out.println("Notunuz BB");

        } else if (not>=50) {

            System.out.println("Notunuz CC");

        }else {
            System.out.println("Notunuz DD" + "\n\n\tKaldiniz");
        }
    }
}
