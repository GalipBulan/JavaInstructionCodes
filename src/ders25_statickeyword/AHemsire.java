package ders25_statickeyword;

public class AHemsire {

    static String hastaneIsmi= "Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya/Ankara";
    static String bashekimIsmi="Dr Mehmet Yilmaz";


    String personelIsmi="Isim belirtilmedi";
    String personelAdresi="Adres belärtälmedi";
    String personelTelefon="Telefon belirtilmedi";


    public String toString() {
        return "Hemsire Bilgileri" +
                "\npersonelIsmi=" + personelIsmi +
                "\npersonelAdresi=" + personelAdresi +
                "\npersonelTelefon=" + personelTelefon +
                "\nhastaneIsmi=" + hastaneIsmi +
                "\nhastaneAdresi=" + hastaneAdresi +
                "\nbashekimIsmi=" + bashekimIsmi;

    }

}
