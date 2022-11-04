package day27_immutableClasses_DateAndTime;

public class C03_StringPool {

    public static void main(String[] args) {

        String a= "";
        a+=2;
        a+='c';
        a+=false;

        if (a=="2cfalse") System.out.println("==");

        // Bu ekranda hic yazdirilmaz cunku
        // Basit sekilde yaazilan "2cfalse" String havuzundadir.
        // fakat "a" havuzda degildir. Ekleyerek gidildigi icin "a" disarida kalir. Bu sebeple esitlik olmaz.

        if (a.equals("2cfalse")) System.out.println("equals");

        // "equals" iki metnin sadece esit olup olmasina bakar.
        // Stringlerin nerede olup olmadigina hic bakmaz. Esitse true yazar


    }
}
