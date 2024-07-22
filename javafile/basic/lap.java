class laptop {
    String model;
    int price;
    public boolean equals(laptop that){
     return this.model.equals(that.model);
    }
}
public class lap{
 public static void main(String[] args) {
    laptop obj= new laptop();
    obj.model="Dell";
    obj.price=45000;
    System.out.println(obj);  //automatically tostring() call behind the scence which is a object class method
   System.out.println(obj.getClass());
   laptop obj2=new laptop();
   obj2.model="Dell";
   boolean result= obj.equals(obj2);
   System.out.println(result);
 }   
}