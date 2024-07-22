enum  status{
    Running ,pending ,flaied, success;
}

public class demoenum{
    public static void main(String[] args) {
        
     status[] s=status.values();
     System.out.println(s);
     status s1=status.Running;
    System.out.println(s1.ordinal());
    for(status s2:s){
        System.out.println(s2+":"+s2.ordinal());
    }

    // enum with if else
   if(s1==status.Running){
    System.out.println("All good");
   }
   if (s1==status.flaied) {
    System.out.println("try agin");
   }
if(s1==status.pending){
    System.out.println("please wait ");
}
if(s1==status.success){
    System.out.println("Done");
}

// enum in switch case
switch ((s1)) {
    case Running:
        System.out.println("all good");
        break;
case pending:
System.out.println("please wait");
case flaied:
System.out.println("try again");
    default:
    System.out.println("Done");
        break;
}
    }
}