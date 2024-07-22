public class trycatch {
    public static void main(String[] args) {
        int i=4;
        int j=0;
        int num []= new int[5];
        String str=null;

     try{
        j=18/i;
        System.out.println(num[2]);
        System.out.println(str.length());
    }
    catch( ArithmeticException e){
        System.out.println("something went wrong"); 
    }
    catch(IndexOutOfBoundsException e){
        System.out.println("index out off range");
    }
    catch(Exception e){
        System.out.println("Something Went");
    }
    System.out.println(j);
    // throw block 
    
    
try{
    j=18/i;
    if(j==0){
        throw new ArithmeticException();
    }
}
catch(ArithmeticException e){
    j=18/1;
    System.out.println("this is the defalut value");
    
}
}
}




