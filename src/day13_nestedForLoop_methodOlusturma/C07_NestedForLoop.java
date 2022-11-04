package day13_nestedForLoop_methodOlusturma;

public class C07_NestedForLoop {

    public static void main(String[] args) {

        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim

        // dis dongu satirlari kontrol eder

        for (int i = 1; i <=4; i++) {   // Dis LOOP dongusu satirlari asagi dogru kontrol eder



            for (int j = 1; j <=4; j++) {    // Ic Loop dongusu sutunlari yana dogru  kontrol eder


                System.out.print(i*j + " ");


            }
            System.out.println(""); // ic Loop bitince alt satira gecmesi icin koyduk

        }


    }
}
