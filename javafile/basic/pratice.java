 class dispatch {
    public void show(){
       System.out.println("in a"); 
    }
    public void show1(){
        System.out.println("in A");
    }
}
 class D_class extends dispatch{
    public void show2(){
        System.out.println("in B");
    }
    public void show(){
        System.out.println("in b"); 
     }
 

}
 class c_class extends dispatch{
    
}
public class pratice{
    public static void main(String[] args) {
        dispatch obj= new D_class();  //upcasting
        obj.show();
      //  obj.show2();// we cannot call the show2 because the reference is of class dispatch
        //  obj=new dispatch();
       // obj.show1();
       D_class obj2=(D_class) obj;
       obj2.show2();
    }
}

