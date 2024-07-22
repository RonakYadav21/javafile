enum laptopenum {
    macbook(2000),dell(4500),hp,thinkpad(5600);
//default constructor  for the object with no price 
private laptopenum(){
   
}
     private int price;
     private laptopenum(int price){
        this.price=price;
        System.out.println("in laptop:"+this.name());
     }
     public int getprice(){
      return price;
     }
   public void setprice(int price){
      this.price=price;
   }
}
public class Innerlaptopenum {
public static void main(String[] args) {
   laptopenum a= laptopenum.macbook;
   System.out.println(a);
   System.out.println(a.getprice());
   a.setprice(4500);
   System.out.println("the new price of macbook is "+a.getprice());

   for(laptopenum l:laptopenum.values()){
      System.out.println( l+":"+l.getprice());
   }
}
    
}
