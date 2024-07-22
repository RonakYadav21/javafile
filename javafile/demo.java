class A{
   public A(){
    super();
    System.out.println("in a");
   }
   public A(int n){
    super();
    System.out.println("int n");
   }
 }
 class B extends A{

    public B(){
        super();
        System.out.println("in b");
       }
   
    public B(int n){
        super();
        //super(n);
       // this();  // calls the  both constructor of class B and also of class A 
        System.out.println("int n");
       }
 }
 
 public class demo{
    public static void main(String[] args) {
         B obj=new B(5);
    }
 }
 