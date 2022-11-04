package day29_stringBuilder_accesModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();

        System.out.println(zaman);

        DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(zaman.format(dft1));


    }
}
