package day03_datacastingWrapperClass;

public class C02_ExplicitNarrovig {

    public static void main(String[] args) {

        int sayi = 20;

        // genis data turundeki bir degeri dar data turundeki bir variabl'a atamak isterseniz
        //java sorumlulugu almanizi ister

        // sorumlugu almah icin cast edecegimiz  degerin onune () icinde

        // cast etmek isdegimiz data turu yazilir.

        // ancak bu durumda data kayiplari ( double' den int'e gecerken virgulden sonrasi silinir. data kayiplari

        // olabilir, baskalasim olabilir.

        short sh = ( short) sayi;

        System.out.println(sh);

        double dbl = 23.5;

        int say = (int) dbl;

        System.out.println(say);

        System.out.println(sh);


        say = 130;

        byte byt = (byte)say; // (int i byte e cevirirsek tekrar tekrar basa doner.)

        System.out.println(byt);






    }
}
