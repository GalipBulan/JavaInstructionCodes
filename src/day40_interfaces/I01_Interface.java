package day40_interfaces;

public interface I01_Interface {

    // Interfaceler ozel yapi olduklarindan yazilsa da yazilmasa da tum verableler
    // public, static ve final dir. YAzsak bile java mat renk yapar.
    // Cunku yazmaya gerek yoktur.

    static String mesaj ="Hello Interface";
    public static boolean guzelMi= true;
    public static final int sayi2= 30;

    String MESAJ="Hello Interface";
    static int SAYI=20;
    public static boolean GUZEL_MI=true;
    public static final int SAYI2=30;


    // interface methodlar hep public abstrect'tir.
    // Bu yuzden method body sine sahip olamazlar

    void method1(); // Interface methodlar method bady sine sahip olamazlar

    abstract int method2();
    public abstract String method3(); // gri yapar cunku interfaceler dogal olarak public ve abstrec'tir
    int method4();










}
