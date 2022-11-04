package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now(); // now methodu bize zamani donduruyor

        System.out.println(tarih);  // 2022-11-04

        System.out.println(tarih.minusDays(100)); // 2022-07-27

        System.out.println(tarih.minusWeeks(5).minusDays(3)); // 2022-09-27

        System.out.println(tarih.plusMonths(5)

                .plusWeeks(2)

                .plusDays(3)); // 2023-04-21

        System.out.println(tarih.plusMonths(1).plusDays(1)); // 2022-12-05

        System.out.println(tarih.getMonthValue()); // 11 Bulundugumuz ayi gosterir

        System.out.println(tarih.getMonth()); // NOVEMBER hangi ay

        System.out.println(tarih.getDayOfWeek());  // FRIDAY hangi gunde oldugumuz

        System.out.println(tarih.getDayOfYear()); // 308 yilin kacinci gunu oldugu

        System.out.println(tarih.withYear(2000).isLeapYear()); // true artik yili gosterir

        System.out.println(tarih.withYear(2022).lengthOfYear()); // 365  yilin kac gun oldugunu gosterir

        System.out.println(tarih.withYear(1987).withMonth(2).withDayOfMonth(23).getDayOfWeek());

        LocalDate date1 = LocalDate.of(2011, 11, 12);

        LocalDate date2 = LocalDate.of(2009, 12, 23);

        System.out.println(date1.isAfter(date2)); // True tarihlerin once olup olmadigi

        System.out.println(date2.isBefore(date1)); // true

        System.out.println(date1.equals(date2)); // false tarihler esit degil



    }
}
