package day32_inheritanceConstructorCall;

public class Sinif extends Okul {

    int sayil = 30;
    int sayi3 = 40;
    String isim2 = "Ayse";
    String isim3 = "Fatma";

    Sinif() {

        System.out.println("Sinif Constructor");
        System.out.println(this.sayil);
       // System.out.println(super.sayil); CTE
        System.out.println(this.sayi2);
        System.out.println(super.sayi2);
        System.out.println(this.sayi3);
       // System.out.println(super.sayi3); CTE
        super.isiml = "Hatice";
        System.out.println(this.isiml);
        System.out.println(super.isiml);
        this.isim2 = "Kemal";
        System.out.println(this.isim2);
        System.out.println(super.isim2);
        System.out.println(this.isim3);
       //  System.out.println(super.isim3); CTE

        }
    public static void main (String[]args){
        Sinif obj = new Sinif();

    }
}