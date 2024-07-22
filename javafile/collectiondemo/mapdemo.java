import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class mapdemo {
    public static void main(String[] args) {
         //  HashMap m=new HashMap();
       HashMap<Integer,String> m=new HashMap<Integer,String>();
             m.put(123, "hellow");
             m.put(124, "how");
             m.put(125, "are");
             m.put(126, "you");
             System.out.println(m);
             m.get(124);
             m.remove(123);
             System.out.println(m);
             System.out.println(m.containsKey(124));
             System.out.println(m.containsValue("how"));
              System.out.println(m.keySet());
              System.out.println(m.values());
              System.out.println(m.entrySet());
              //printing single key 
            for(int i:m.keySet()){
                System.out.println(i);
            }
            for(String j:m.values()){
                System.out.println(j);
            }

            for(int i:m.keySet()){
                System.out.println(i+"   "+m.get(i));
            }

            //entry methods
            for(Map.Entry entry :m.entrySet()){
                System.out.println(entry.getKey()+"  "+entry.getValue());
            }
        Set s=m.entrySet();
         Iterator it=  s.iterator();

         while (it.hasNext()) {
            System.out.println(it.next());
         }
    }
}
