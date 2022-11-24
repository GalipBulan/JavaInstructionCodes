package day40_interfaces;

public interface I03_InterfaceChildOfinterface extends I01_Interface {

    // Eger bir İnterface'i baska bir interface'in child'i yapmak isterseniz
    // extends keyword kullanılır.
    // Bir interface concrete class'i INHERIT EDEMEZ


    int method2();

    String method3();

    void method1();

    // interface bir child parent interface'deki
    // abstract methodu override edebilir ama
    // ikisinin de body'si olmadigindan
    // bu islemin bir anlami yoktur

    int method4();

    boolean method5();



}
