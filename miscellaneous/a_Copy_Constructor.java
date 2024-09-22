
package learning.miscellaneous;

class Student6{  
    int id;  
    String name;  

    //constructor to initialize integer and string  
    Student6(int i,String n){  
    id = i;  
    name = n;  
    }  

    //constructor to initialize another object  
    Student6(Student6 s){  
        id = s.id;  
        name =s.name;  
    }  
    void display(){
        System.out.println(id+" "+name);
    }           
} 

public class a_Copy_Constructor {
    public static void main(String args[]){  
        Student6 s1 = new Student6(111,"Liza");  
        Student6 s2 = new Student6(s1);  
        s1.display();  
        s2.display();  
    }
}
