package learning.Inheritence;

interface One1 {
    public void print_one();
}

interface Two2 {
    public void print_two();
}

interface Three3 {
    public void print_two();
}

class Child implements One1, Two2 {
    @Override 
    public void print_one() {
        System.out.println("One");
    }
    @Override
    public void print_two() { 
        System.out.println("Two");
    }
}

// Drived class
public class d_multiple_inheritance {
    public static void main(String[] args){
        Child c = new Child();
        c.print_one();
        c.print_two();
        c.print_one();
    }
}
