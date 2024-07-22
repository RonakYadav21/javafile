import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


/**
 * Innercomparatordemo
 */
class student {
int age;
String name;

public student(int age, String name) {
  this.age = age;
  this.name = name;
}

@Override
public String toString() {
  return "student [age=" + age + ", name=" + name + "]";
}

};
public class comparatordemo{
public static void main(String[] args) {

   /*
   Comparator<Integer> com=new Comparator<Integer>() {
    public int compare(Integer i, Integer j){
      if(i%10>j%10)
      return 1;
      else{
        return-1;
      }
};
ArrayList<Integer> nums=new ArrayList<>();
nums.add(415);
nums.add(23);
nums.add(12);
nums.add(45);
Collections.sort(nums);
//Collections.sort(nums,com);
System.out.println(nums);
      */ 

      Comparator<student> s=new Comparator<student>() {
        public int compare(student i, student j){
          if(i.age>j.age)
          return 1;
          else{
            return-1;
          }
    
      }
    };
    
    ArrayList<student> studs = new ArrayList<>();
    studs.add(new student(34, "ronak"));
     studs.add(new student(12,"drishti"));
   Collections.sort(studs,s);
   System.out.println(studs);

}
}





