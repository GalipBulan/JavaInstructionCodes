package day25_staticKeyword;

public class AHemsireRanner {

    public static void main(String[] args) {

        AHemsire h1 = new AHemsire();

        h1.personelIsmi= "Ayse Yilmaz";
        h1.personelAdresi="Ulus/Ankara";
        h1.personelTelefon= "2222534647568";

        System.out.println("H1=" +h1);



        AHemsire h2 = new AHemsire();

        h2.personelIsmi= "Hatice Yilmaz";
        h2.personelAdresi="Sincan/Ankara";
        h2.personelTelefon= "00002534647568";

        AHemsire.bashekimIsmi = "Yasar Kemal";

        // static bir variable 'a atama yaptigimiz andan itibaren butun objelerin
        // ilgili degeri degisir  (bashekimIsmi    Yasar Kemal'dir)

        System.out.println("H2=" + h2);



        AHemsire h3 = new AHemsire();

        h3.hastaneIsmi= "Java Hastanesi";

        System.out.println("H3=" + h3);


        AHemsire h4 = new AHemsire();

        h4.personelIsmi= "Serap Atmaca";
        h4.personelAdresi="Kadikoy/Ankara";
        h4.personelTelefon= "00002534647568";

        System.out.println("H4: " + h4);









    }
}
