
package learning.Abstraction;

abstract class animal{
    abstract void sound();
}
class dog extends animal{
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}
class lion extends animal{
    @Override
    public void sound(){
        System.out.println("Roar");
    }
}

public class a_abstractionClass {
     public static void main(String[] args) {
        animal d = new dog();
        animal l = new lion(); 
        d.sound();
        l.sound();
    }  
}
