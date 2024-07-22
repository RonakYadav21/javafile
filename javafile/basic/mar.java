 abstract class car{
   public abstract void drive();
    public void feature(){
    System.out.println(" the car has has many features");
}
}
class wagnor extends car{
    public void drive(){
       System.out.println("driving"); 
    }
}
public class mar{
    public static void main(String[] args) {
        wagnor w=new wagnor();
        w.drive();
    }
}