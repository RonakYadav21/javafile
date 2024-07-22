// creating arraylist of object  
//package collectiondemo;
import java.util.ArrayList;
import java.util.Collections;
class arraylistobj{
    String name;
     int age;
    public  arraylistobj(String name,int age){
        this.name=name;
        this.age= age;
    }
}
 public class Innerarraylistobject {
     public static void main(String[] args) {
         arraylistobj p1=new arraylistobj("ronak",20);
         arraylistobj p2=new arraylistobj("prince", 30);
          ArrayList<arraylistobj> person=new ArrayList<>();
          person.add(p1);
          person.add(p2);
          person.add(new arraylistobj( "python", 23));
          for(arraylistobj e:person){
              System.out.println("name is "+e.name+" age "+e.age);
            }
            //adding  the elements of one array to other arratlist
            ArrayList<String> al=new ArrayList<>();
            al.add("x");
            al.add("a");
            al.add("b");
            al.add("t");
            ArrayList<String> alnew=new ArrayList<>();
            alnew.addAll(al);
            System.out.println(alnew);
            //  alnew.removeAll(alnew);
            //sorting
            Collections.sort(al);
            System.out.println("after sorting " +al);
            //Collections.sort(al,Collections.reverseOrder());
            Collections.shuffle(al);
            System.out.println("after shuffling "+al);
        }
    }


