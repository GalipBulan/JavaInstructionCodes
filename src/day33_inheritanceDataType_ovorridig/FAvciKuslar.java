package day33_inheritanceDataType_ovorridig;

public class FAvciKuslar extends  EKuslar{

    public  void  hareket() {
        System.out.println("Avci Kuslar ucarlar");
    }
    public  void beslenme() {
        System.out.println("Avci Kuslar et yerler");
    }
    public  void pence() {
        System.out.println("Avci Kuslar pencelidir");
    }
    public void gaga() {
        System.out.println("Avci Kuslar sivri gagali");
    }
    public static void main(String[] args) {

        FAvciKuslar avci1 = new FAvciKuslar();
        // Bir obje olusturulurkeb constructor ve data türü ayni ise hangi methodun gecerli oldugunu bulmak icin
        // o classa gider varsa kullaniriz yoksa sirasi ise parend lere gider ilk buldugumuzu kullaniriy
        // Method lar hangi clasda olursa olsun objenin en guncel ozelligini getirir.

        avci1.beslenme(); // AvciKuslar
        avci1.gaga();     // AvciKuslar
        avci1.pence();    // AvciKuslar
        avci1.hareket();  // AvciKislar
        avci1.cogalma();  // Kuslar
        avci1.kanat();    // Kuslar
        avci1.omur();     // Hayvanlar
        avci1.solunum();  // Kuslar


        EKuslar avci2 = new FAvciKuslar();
        // Bir obje olusturulurkrn data turu ile cons farkli ise hangi method un gecerligi olacagini
        // bulmak icin once data turunun oldugu clas ve parent lere bakarak o methodu buluiruz
        // Bulamazsak CTE verir
        // Bulursak hemen calistirmayiz once o method override edilmis mi diye kontrol ederiz
        // Ovirrid edilmis ise ovirrid edilmis methodu kullaniriz

        avci2.beslenme(); // AvciKuslar  // override
        avci2.gaga();     // AvciKuslar  // 0verride
        // avci2.pence(); // CTE // Data turunun oldugu ve ustundeki class da bulamadigi icin. Bulsaydi en gunceline bakacakti
        avci2.hareket();  // AvciKislar  // override
        avci2.cogalma();  // Kuslar
        avci2.kanat();    // Kuslar
        avci2.omur();     // Hayvanlar
        avci2.solunum();  // Kuslar


        DHayvanlar avci3 = new FAvciKuslar();

        avci3.beslenme();    // AvciKuslar  // override
        // avci3.gaga();     // AvciKuslar CTE // Data turunun oldugu ve ustundeki class da bulamadigi icin.
        // avci3.pence();    // AvciKuslar CTE // Data turunun oldugu ve ustundeki class da bulamadigi icin.
        avci3.hareket();     // AvciKislar  // override
        avci3.cogalma();     // Kuslar      // override
        // avci3.kanat();    // Kuslar  CTE // Data turunun oldugu ve ustundeki class da bulamadigi icin.
        avci3.omur();        // Hayvanlar
        avci3.solunum();     // Kuslar      // override


        EKuslar kus1 = new FAvciKuslar();

        // Data turu ve cons ayni ise ilk buldugumuzu hemen kullaniriz

        kus1.cogalma();   // Kuslar
        kus1.gaga();      // Kuslar
        kus1.kanat();     // Kuslar
        kus1.hareket();   // Hayvanlar
        kus1.solunum();   // Kuslar
        kus1.beslenme();  // Hayvanlar
        kus1.omur();      // Hayvanlar

        DHayvanlar kus2 = new EKuslar();

        kus2.cogalma();   // Kuslar  // override
        // kus2.gaga();      // Kuslar // Data turunun oldugu ve ustundeki class da bulamadigi icin.
        // kus2.kanat();     // Kuslar // Data turunun oldugu ve ustundeki class da bulamadigi icin.
        kus2.hareket();   // Hayvanlar
        kus2.solunum();   // Kuslar  // override
        kus2.beslenme();  // Hayvanlar
        kus2.omur();      // Hayvanlar


    }
}
