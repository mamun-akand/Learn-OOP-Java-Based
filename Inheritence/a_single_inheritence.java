package learning.Inheritence;

class One {
    public void print_hello()
    {
        System.out.println("Hello");
    }
}

class Two extends One {
    public void print_mamun() { 
        System.out.println("Mamun");
    }
}

public class a_single_inheritence {
    public static void main (String[] arg){
        Two obj = new Two();
        obj.print_hello();
        obj.print_mamun();
        obj.print_hello();
    }     
}
