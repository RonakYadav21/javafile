class classandobject {
 public int add(int n1,int n2){
    int r=n1+n2;
    return r;
 }
}
public class cal{
   public static void main(String[] args) {
     int num=3;
     int num2=4;
     classandobject obj=new classandobject();
     int result=obj.add(num,num2);
      System.out.println(result);
   }
}
