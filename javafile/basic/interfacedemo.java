interface  ainterface {
    void show();
    void display();
}
 interface Innerinterfacedemo{
    void show2();
}
class binterface implements ainterface,Innerinterfacedemo{
    public void show(){
       System.out.println("in show"); 
    }
    public void display(){
        System.out.println("in a display ");
    }
    public void show2(){
        System.out.println("in show2");
    }
}

public class interfacedemo{
    public static void main(String[] args) {
        binterface a=new binterface();
a.show();
a.display();
a.show2();
    }
}


