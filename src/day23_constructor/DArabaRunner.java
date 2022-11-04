package day23_constructor;

public class DArabaRunner {

    public static void main(String[] args) {

        Daraba arb1= new Daraba();

        System.out.println(arb1.marka);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.model);
        System.out.println(arb1.yil);
        System.out.println(arb1.yakit);

        System.out.println(arb1);

        Daraba arb2 = new Daraba();

        arb2.marka= "Fiat";
        arb2.model= "Linea";
        arb2.yakit= "Bezin";
        arb2.yil=2020;
        arb2.fiyat=100000;

        System.out.println(arb2);


        Daraba arb3 = new Daraba();

        arb3.marka = "Opel";
        arb3.model = "Mariva";
        arb3.yakit = "Dizel";
        arb3.yil=2022;
        arb3.fiyat=200000;

        System.out.println(arb3);








    }
}
