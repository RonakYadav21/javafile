import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;


public class arraylistdemo {
    public static void main(String[] args) {
         //decalaration of aaraylist
         // ArrayList <String> al=new ArrayList<String>();
        // List al=new ArrayList();
        ArrayList al=new ArrayList();
             al.add(100);
             al.add("welcome");
             al.add(23.5);


        System.out.println(al);
        System.out.println(al.size());
        //al.remove("welcome");
        System.out.println(al.remove(1));
        al.add(2,1);
        System.out.println(al);
        System.out.println(al.get(2)); //2 is the index of the element/object 
        //change/replace value from the arraylist
        al.set(2, "#c");
        System.out.println("set element is"+al);
        System.out.println(al.contains("c#"));
        System.out.println(al.isEmpty());

        //reading values from arraylist   -> 1)for loop
        System.out.println("reading element using form loop");
        for(int i=0;i<al.size();i++){
           System.out.println( al.get(i));  //get take index as argument 
        }


        //2) for each loop
        System.out.println("reading element by using for each loop");
        for(Object e: al){
            System.out.println(e);
    }


    // 3) iterator
    Iterator it = al.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
}
}
