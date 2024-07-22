import java.util.Hashtable;
public class hashtabledemo {
    public static void main(String[] args) {
      //  Hashtable  t=new Hashtable<>();   //capacity is 16 loadfactor  is 0.75
        Hashtable <Integer,String> tb=new Hashtable<Integer,String>();   
         tb.put(101,"jhon");
         tb.put(102,"David");
         tb.put(103,"Smith");
         tb.put(104, "Smith");
         System.out.println(tb);
         System.out.println(tb.get(103));
   System.out.println(tb.values());
        }
    }




    