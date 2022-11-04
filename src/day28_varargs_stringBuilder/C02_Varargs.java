package day28_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        topla(5,6);
        topla(5,3,8);
        topla(2,5,3,8);
        topla(2,5,3,8,6,8);
        topla(2,5,3,8,2,4,7,65);
        topla();
        topla(2,5,3,8,7,4,3,56,7,98,67,6,56);

        // Bir method da parametre sayisini sinirlandirmak istemezsek standart bir  varaible yerine varargs kullaniriz
        // Varargs data tururnun yanina ... koyuklarak deklare edilir
        // int...  sayisi belirli olmayan int parametreler olan bir arraydir
    }

    public static void topla(int... sayilar) {

        int toplamSonucu = 0;

        for (int aech:sayilar

             ) { toplamSonucu += aech;

        } System.out.println("Girilen sayilarin toplami: " + toplamSonucu);

    }
}
