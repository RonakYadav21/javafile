class anonymousintro {
    public void display(){
        System.out.println("in a display of outer class");
    }
}

class anonymousinner{
    public void create(){
anonymousintro an=new anonymousintro(){
    //@Override
        public void display(){
           System.out.println("in a anonymousinner class"); 
        }
    };
 an.display();
}
}
public class Main {
    public static void main(String[] args) {
        
        anonymousinner p1=new anonymousinner();
        p1.create();   //The create() method of p1 is called, which in turn creates an instance of the anonymous inner class and calls its display() method.

    }
}