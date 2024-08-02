import java.util.Scanner;
public class atmproject {
    
     public static void main(String[] args) {

        int balance=10000;
        int withdraw,deposite;
        Scanner sc = new Scanner(System.in);
        try{

            while (true) {
                
            System.out.println("Automated Teller Machine");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for Deposite");
            System.out.println("choose 3 for Check Balance");
            System.out.println("choose 4 for  Exit ");
            System.out.println("choose the operation you want to perform ");

            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the amount you want to withdraw");
                      withdraw=sc.nextInt();
                    if(withdraw<=balance){
                       balance=balance-withdraw;
                       System.out.println("please collect your money");
                    }
                    break;
                    case 2:
                    System.out.println("enter amount you wnat ot deposite");
                    deposite=sc.nextInt();
                    balance+=deposite;
                    System.out.println("total amount is "+ balance);
            break;
            case 3:
              System.out.println("your current balance is "+balance);
              break;
              case 4:
              System.exit(0);
              default:
              System.err.println("choose correct value");
              break;
            }
        }
    }
    finally{
        sc.close();
    }

     }
}
