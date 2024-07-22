/**
 * functioninter
 **/
@FunctionalInterface
  interface functioninter {
    void show();
    
  }
  public class functioninterdemo{
    public static void main(String[] args) {
        
       // functioninter obj=new functioninter() {
            
          //  public void show()
         //   {
               // System.out.println("in show");
          //  }
            
     //   };
       // obj.show();

       // lambda expression
       functioninter obj= ()->
             System.out.println("in a show ");
                 
             obj.show();
             // if show takes a arguments
             //functioninter obj=i-> system...("in show" +i)

             //if function needs to return value
             // A obj =( i,j )-> i+j
             //  result=obj.show(i ,j)
    }
    }

