
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
public class streamdemo {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(4,6,7,7,6,1,2,22); //aslist is used to directly putting the value in the list without using add() 

/*Stream<Integer> s2=nums.stream();
Stream <Integer> s3=s2.filter(n->n%2==0);
//s3.forEach(n->System.out.println(n));
Stream<Integer> s4=s3.map(n->n*2);
s4.forEach(n->System.out.println(n));
*/
 int result =nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
 System.out.println(result);
    }
}