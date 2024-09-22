
package learning.Abstraction;

interface customer{
    int rice_amnt = 5; //public + static + final
    void purchase();   //public + abstract
}
class seller implements customer {
    public void purchase(){
        System.out.println("Customer needs " + " " + rice_amnt + " rice");
    }
}

public class c_Interface_VariablePublicStaticFinal {
    public static void main(String[] args){
        customer c = new seller();
        c.purchase();
        
        System.out.println(customer.rice_amnt); 
    }
}
