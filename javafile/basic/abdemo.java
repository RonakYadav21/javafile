
//anonymous inner class with abstract class 
abstract class ab{
    public abstract void show();
}
public class abdemo{
    public static void main(String [] args){
    ab obj=new ab(){
       public void show(){
        System.out.println("in a new show");
       } 
    };
    obj.show();
}
}