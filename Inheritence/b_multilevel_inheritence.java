package learning.Inheritence;

class One {
    public void print_one() {
        System.out.println("One");
    }
}

class Two extends One {
    public void print_two() {
        System.out.println("Two");
    }
}

class Three extends Two {
    public void print_three() {
        System.out.println("Three");
    }
}

// Driver class
public class b_multilevel_inheritence {
    public static void main(String[] args) {
        // Creating an object of class Three
        Three obj = new Three();
        
        // Calling method from class One
        obj.print_one();
        
        // Calling method from class Two
        obj.print_two();
        
        // Calling method from class Three
        obj.print_three();
    }
}
