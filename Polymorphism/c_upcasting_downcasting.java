package learning.Polymorphism;

class A1 {
    void show(){
        System.out.println("Super Class");
    }
}

class B1 extends A1 {
    @Override
    void show(){
        System.out.println("Base Class");
    }
    
    void specificMethod() {
        System.out.println("Specific to Class B");
    }
}

public class c_upcasting_downcasting {
    public static void main(String[] args) {
        // Upcasting
        A1 obj = new B1();  // Upcasting: B object is cast to A reference
        obj.show();       // Calls the overridden method in class B
       
        // obj.specificMethod(); //here it will not work. Cause in Reference A specificMethod() does not exist. only existed methods in A will get access. 
        
        // Downcasting
        B1 objB = (B1) obj;  // Downcast the superclass reference to the subclass
        objB.specificMethod();  // Now you can access specificMethod()
    }
}


