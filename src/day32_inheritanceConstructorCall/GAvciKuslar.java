package day32_inheritanceConstructorCall;

public class GAvciKuslar extends FKuslar {

    public static void main(String[] args) {

        GAvciKuslar avci1 = new GAvciKuslar();

        // Child clas da obje olusturmak icin child class constructor i kullanir.
        // Child klass da olusturulan yeni bir obje  parand clasa da tanimlanabilir.
        // Java hicbir sorun cikarmaz.

        FKuslar avci2 = new GAvciKuslar();

        EHayvalar avci3 = new GAvciKuslar();


        String str = new String("Kus");

        // String hem class dir hem  de bu class dan olusturulan her bir obje ivin de data turudur

        // GAvciKuslar, FKuslar, EHayvalar  hem class dir
        // hem  de bu class dan olusturulan her bir obje ivin de data turudur.

        // Eger constructor ve data turu farkli secilirse bu durumda class uyesi olan
        // variable ve method lar farkli davranislar gosterirrler.



    }
}
