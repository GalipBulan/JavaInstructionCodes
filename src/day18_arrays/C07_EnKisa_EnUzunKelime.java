package day18_arrays;

public class C07_EnKisa_EnUzunKelime {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.


        String[]kelime = {"Ali", "Ahmet", "Aziz Turan"};

        EnKisaEnUzunKelime(kelime);

    }

    public static void EnKisaEnUzunKelime(String[] kelime) {

        String enUzunKelime= kelime[0];

        String enKisaKelime= kelime[0];

        for (int i = 1; i < kelime.length; i++) {

            if (kelime[i].length()>enUzunKelime.length()){

                enUzunKelime= kelime[i];


            }

            if (kelime[i].length()<enKisaKelime.length()){

                enKisaKelime=kelime[i];


            }

        }

        System.out.println("En uzun isim: " + enUzunKelime);

        System.out.println("En kisa isim: " + enKisaKelime);


    }

    }



