
package learning.Abstraction;
import java.util.Scanner;

interface client {  
    void input();  //public + abstract
    void output(); //public + abstract
}
class developer implements client {
    String name; int salary;
    
    @Override
    public void input(){
        Scanner INPUT = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = INPUT.nextLine();
        System.out.println("Enter Salary: ");
        salary = INPUT.nextInt();
    }
    @Override
    public void output(){
        System.out.println(name + " " + salary);
    }
}

public class b_Interface {
    public static void main(String[] args) {
        client obj = new developer();
        obj.input();
        obj.output();
    }
}
