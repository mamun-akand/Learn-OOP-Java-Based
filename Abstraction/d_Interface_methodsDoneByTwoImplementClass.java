
package learning.Abstraction;

interface client_website{
    void frontend();    //Public + abstract 
    void backend();     //Public + abstract 
}
abstract class frontend__mamun implements client_website{
    @Override
    public void frontend(){
        System.out.println("HTML, CSS, JS, ReactJS Work Done");
    }
}
class backend__yousuf extends frontend__mamun{  //Remaining work done by Yousuf
    @Override
    public void backend(){
        System.out.println("Database, .NET, API Work Done");
    }
}

public class d_Interface_methodsDoneByTwoImplementClass {
    public static void main(String[] args) {
        backend__yousuf obj = new backend__yousuf();
        obj.frontend();
        obj.backend();
    }
}
