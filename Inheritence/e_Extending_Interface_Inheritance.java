
package learning.Inheritence;

interface client_A {
    void add();
}
interface client_B extends client_A {
    void sub();
}

class mamun implements client_B{
    @Override
    public void add(){
        int a=15, b=10;
        int c=a+b;
        System.out.println("Addition = "+c);
    }
    @Override
    public void sub(){
        int a=15, b=10;
        int c=a-b;
        System.out.println("Addition = "+c);
    }
}

public class e_Extending_Interface_Inheritance {
    public static void main(String[] args) {
         client_B obj = new mamun();
         obj.add();
         obj.sub();
    }
}
