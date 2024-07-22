class A extends Thread{
     public void  run(){
        for(int i=0;i<=50;i++){

            System.out.println("in A");
            try{

                Thread.sleep(3);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
     }

     public void method1() {
        // Method 1 logic
        System.out.println("Executing method 1");
    }


}
class B extends Thread{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("in B");
            try{

                Thread.sleep(3);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}

public class multhread {
    public static void main(String[] args) {
         A obj1=new A();
         B obj2=new B();
        obj1.setPriority(Thread.MAX_PRIORITY);
         obj1.method1();
         obj1.start();
       //  try{

         //   Thread.sleep(2);
      //  }
       // catch(InterruptedException e){
          //  e.printStackTrace();
       // }


         obj2.start();
    }
}
