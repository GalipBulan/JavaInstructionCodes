package day33_inheritanceDataType_ovorridig;

public class EKuslar extends  DHayvanlar {

    protected void kanat() {
        System.out.println("Kuslar kanatkari vardi");
    }
    protected void solunum() {
        System.out.println("Kuslar akcigerle nefes alirlar");
    }
    protected void gaga()  {
        System.out.println("Kuslar gagalari vardir");
    }
    protected void cogalma() {
        System.out.println("Kuslar yumurtayla cogalirla");
    }
}
