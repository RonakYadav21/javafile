public class project {
    public static void main(String[] args) {
        String days="monday";
        String result ="";
        result=switch (days) {
            case "sunday","saturday"->"6";

            case"monday"->"5";
            // System.out.println("7 am");
            
            default->"8";
           // System.out.println("6 am");
                
        };
        System.out.println("the result is"+result);
    }
}