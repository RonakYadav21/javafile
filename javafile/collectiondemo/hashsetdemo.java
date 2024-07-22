import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class hashsetdemo {
    public static void main(String[] args) {
        Set hs=new TreeSet<>();
       // HashSet hs=new HashSet<>();

        hs.add(100);
        hs.add(34);
        hs.add(45);
        System.out.println("hs"+hs);

        //union intersection and difference
        HashSet h=new HashSet<>();
        h.add("welcome");
        h.add(34);
        h.add(34.55); 
        System.out.println("h "+h);
        //intersection
        h.retainAll(hs);
        System.out.println("intersection"+h);

        //union
        h.addAll(hs);
        System.out.println("union"+h);

        //difference
        hs.removeAll(h);
        System.out.println(hs);
        //subset
        h.contains(hs);
        System.out.println("subset"+h);
    }
}
