
package learning.Polymorphism;

class A {
    void show(){
        System.out.println("Super Class");
    }
}

class B extends A {
    @Override
    void show(){
//        super.show();
        System.out.println("Base Class");
    }
}

public class b_method_overridding {
    public static void main(String[] arg){
        B obj = new B();
        obj.show();
    }
}
