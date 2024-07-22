class static_block {
      String brand;
      int price;
      static String name;
      //static method to initialize static variable
       static{
        name="phone";
        System.out.println("a static block");
       }
      public static_block(){
        brand=" ";
        price=100;
        System.out.println("a constructor");

      }
      public static_block(String brand, int price) {
        this.brand = brand;
        this.price = price;
      }
      
}
public class  block_class{
  public static void main(String[] args) throws ClassNotFoundException {
    //to only load a class
   Class.forName("static_block");
   //to create an object load a class
   static_block obj=new static_block();
   static_block obj2=new static_block();
  }
    
}


