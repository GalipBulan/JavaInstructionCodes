package day27_immutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now(); // Tarih ve saati ayni anda yazdirabiliriz

        System.out.println(zaman); // 2022-10-29T18:30:07.085363

        System.out.println(zaman.getDayOfYear()); // 302 bugun ayin kacinci gunu

        System.out.println(zaman.minusDays(100));

        System.out.println(zaman.plusHours(100));
    }
}
