
package learning.Polymorphism;

class A {
    void add(){
        int a = 10, b = 8;
        int c = a+b;
        System.out.println(c);
    }
    void add(int x, int y){
        int c = x+y;
        System.out.println(c);
    }
    void add(int x, double y){
        double c = x+y;
        System.out.println(c);
    }
}

public class a_method_overloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.add();
        obj.add(15, 16);
        obj.add(10, 30.5);
    }
}
