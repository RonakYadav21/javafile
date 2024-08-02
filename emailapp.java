import java.util.Scanner;

 class email {
    private String Fristname;
    private String Lastname;
    private String department;
    private int mailboxcapacity=500;
    private String alternateemail;
    private int defalutpasslength=10;
    private String password;
    private String email;

    public email(String fristname, String Lastname){
       this.Fristname=fristname;
       this.Lastname=Lastname;
       System.out.println("Emailcreated :"+this.Fristname+this.Lastname);
       this.department=departmentName();
       System.out.println("Department: "+this.department);

       this.password=randompassword(defalutpasslength);
       System.out.println("password is:" +this.password);

       email=fristname.toLowerCase()+"."+Lastname.toLowerCase()+"@"+department+"."+"company.com";
       System.err.println("your email is "+email);
    }
    private String departmentName(){
          System.out.println("Department code \n  1 for Sales\n  2 for Devlopment \n 3 for Accounting \n 4 for none");
          Scanner sc=new Scanner(System.in);
          int choice=sc.nextInt();
          if(choice==1){
            return "Sales";
          }
          else if(choice==2){
            return "Devlopment";
          }
          else if(choice==3){
            return "Accounting";
          }
          else{
            return " ";
          }
    }
    public  String randompassword(int length){
             String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*!~";
             char [] password=new char[length];
             for(int i=0;i<length;i++){
              int rand=(int)(Math.random()*passwordset.length());
              password[i]=passwordset.charAt(rand);
             }
             return new String(password); // b/c passward are set of char
    }

   public void setmailboxcapacity(int capacity) {
    this.mailboxcapacity=capacity;
   }

   public void changepassword(String password){
    this.password=password;
   }
   public void setalternativeEmail(String altEmail){
    this.alternateemail=altEmail;
   }

   public int getmailboxcapacity(){return mailboxcapacity;}
   public String getalternativeEmail(){return alternateemail;
  }
  public String getpassword(){return password;}
}

public class emailapp {
    public static void main(String[] args) {
      email e= new email("ronak", "yadav");
     // e.departmentName();
     e.changepassword("ronak#45344");
     String password=e.getpassword();
     System.out.println( " your new password is"+password);
    }
  }