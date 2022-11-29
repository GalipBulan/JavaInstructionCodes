package day40_interfaces;

public class I09_ChildOfI08 implements I08_InterfaceStaticVeDefaultMethods {


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }


    public static void main(String[] args) {
        I09_ChildOfI08 obj= new I09_ChildOfI08(); //default kullanilan method'lar obje olusturularak cagrilabilirken
        obj.method3();

        I08_InterfaceStaticVeDefaultMethods.method4(); //tatic olarak isaretlenen method'lar direk kullanilabilir.

    }


}