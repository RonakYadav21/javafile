import java.util.Scanner;

class userexception  extends Exception {
    userexception(String string ){
        super(string);
    }
}
 public class  user{
    /**
     */
    public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
 int i =sc.nextInt();
     int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new userexception("this is the user exception ");
            }
        }
        catch(userexception e){
            j=18/1;
            System.out.println("this is the defalut value " +e);  
        }     
    }
 }











