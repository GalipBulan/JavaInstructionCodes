package day23_constructor;

public class Daraba {

    // Bir proje olustururken tum classlarda main method olmasina gerek yoktur.
    // Cogu klas obje olusturularak kullanilmak uzere hazirlanmis depolardir.
    // biz de bu klassi araba objeleri icin bir depo olarak dizayn edelim.

    // Her class olusturuldugunda java o class dan obje olusturulabilmesi icin default bir constructor olusturur
    //

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;


    public String toString() {
        return "Araba Ozellikleri" +
                "\nMarka=" + marka +
                "\nmodel=" + model +
                "\nyakit=" + yakit +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat ;
    }




    public int maxHiz(String yakit){
        int maxHiz=120;

        if(yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }

}
