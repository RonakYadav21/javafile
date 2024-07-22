
class B {
    public void show(){
        System.out.println("in show");
    }
}
/*
class A extends B implements Runnable{
//class A implements Runnable{
     void run();
    for(int i=0;i<5;i++){
        System.out.println("in runnable");
    }
}
}

class C extends Thread{
    public void run(){
        for(int i=0;i<=12;i++){
            System.out.println("in B");
            
        }
    }
}
*/
public class runnableinterface {
    public static void main(String[] args) {
      /*
      Runnable obj1=new A();
      Runnable obj2=new C();
      Thread t1=new Thread(obj1);
      Thread t2=new Thread(obj2);
      t1.start();
      t2.start();
      */  

      //we can also use lambda expression
        Runnable obj=()->{

                for(int i=0;i<5;i++){
                    System.out.println("in runnable");
                }
            };
            Runnable obj2=()->{
                for(int i=0;i<=12;i++){
                    System.out.println("in B");
                }
        
            };

            Thread t1=new Thread(obj);
            Thread t2=new Thread(obj2);
            t2.start();
            t1.start();
        }
    }

