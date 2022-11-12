package day34_overreding_pollymorphism;

public class CParent {

    protected void method1() {

    }
    private void method3() { // Private ve static metdod lar ovirride edilemez

    }
    protected static void method2() { // Private ve static metdod lar ovirride edilemez
    }
    protected void method4() { // Sorun cikarmadi cunku return type ayni

    }
    protected Object method5() { // Sorun cikarmadi cunku  Object Stringin  in CParent i

        return "ali";
    }

    }




