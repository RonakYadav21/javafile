import java.util.Iterator;
import java.util.LinkedList;


public class linkedlistDemo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
       // LinkedList<Integer> li=new LinkedList<Integer>();
        l.add(100);
        l.add("s");
        l.add(34.5);
        l.add(null);
        l.add(true);
        System.out.println(l);
        //insert to add element  inbetween the list 
        l.add(3, "hellow");
        System.out.println(l);
        System.out.println(l.get(3));
        //change the value
        l.set(2, 67);
       System.out.println(l.contains("java"));
        System.out.println(l);

        //reading object from linkedlist
for(int i=0;i<l.size();i++){
    System.out.println(l.get(i));
}

for(Object e:l){
    System.out.println(e);
}
//iterator method
Iterator it=l.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}


//stack and queue operation
l.addFirst(23);
l.addLast("we");
System.out.println(l);
System.out.println(l.getFirst());
System.out.println(l.removeFirst());

    }
}
