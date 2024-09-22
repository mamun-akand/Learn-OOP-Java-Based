
package learning.miscellaneous;

class ABC{  
    int x = 30;  
}  

public class c_Shallow_Copy {     
    public static void main(String argvs[]){  
        ABC obj1 = new ABC();  //obj1 is reference of the object
        
        // it will copy the reference 
        // creating only one object (Obj1) and
        // both object (obj1, ob2) pointing to one reference 
        ABC obj2 = obj1;  	// obj1 reference is assigned to obj2 reference
        
        // updating the value to 6, ob1.x and ob2.x both will change
        obj2.x = 6;  
        System.out.println("The value of x is: " + obj1.x);  
        System.out.println("The value of x is: " + obj2.x);  
    }  
}  

