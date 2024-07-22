
class A {
    int age;
    public void show(){
        System.out.println("in a");
    }

    //creating a inner class
    class B{
        public void config(){
         System.out.println("in config");   
        }
    }
}
 public class innmethod{
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        A.B obj2=obj.new B();  //obj of class a is usedd because it is a non static class and the non static class  is  created by the object 
        obj2.config();
    }
}