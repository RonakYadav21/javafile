interface ainterface{
    void run();
}
interface binter extends ainterface{

}
class d implements binter{
  public void run(){
    System.out.println("in run");
  }
}
public class  cinterface{
    public static void main(String[] args) {
        binter obj=new d();
        obj.run();

    }
}

