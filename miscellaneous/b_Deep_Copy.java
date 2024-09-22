
package learning.miscellaneous;

class ABC {
    int x;

    // Deep copy constructor
    ABC(ABC original) {
        this.x = original.x; // Copying the value of x from the original object
    }
    // Default constructor
    ABC() {
    }
}

public class b_Deep_Copy {
    public static void main(String[] args) {
        ABC obj1 = new ABC();
        obj1.x = 10;

        // Creating a new object and performing deep copy
        ABC obj2 = new ABC(obj1);

        // updating the value to 6 using the reference variable obj2
        obj2.x = 6;

        // printing the value of x using reference variable obj1
        System.out.println("The value of x for obj1 is: " + obj1.x);
        System.out.println("The value of x for obj2 is: " + obj2.x);
    }
}
