package day38_AbstractClasses;

public class DChildClassOfAbstractClass extends CParentAbstractClass {

    // Abstract bir class'daki, abstract method'larin TAMAMI
    // concrete child class'lar tarafindan override edilmelidir.

    @Override
    public void mecburuMethod1() {

    }

    @Override
    public void mecburiMethod2() {

        System.out.println("Child class method icerisinde method'u kendine uyarlar");

    }
}
