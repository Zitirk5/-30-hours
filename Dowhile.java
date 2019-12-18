    import java.util.Scanner;
    public class Dowhile
    {
        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            int balance=10000,withdraw,deposite,a;
            int pin=0;
            int count=0;
            System.out.println("enter a pin");
            do{
                
                if(count<3){
                    System.out.println("count=" +count);
                   
                    pin= input.nextInt();
                    count++;
                    
                }
               
                else{
                    System.out.println("blocked");
                     System.out.println("enter your pin again");
                    break;
                }
                
            }while(pin !=123);
            if(pin ==123)
            {
                 System.out.println("Welcome to Bank of Kathmandu");
                 System.out.println("1. For balance, 2. for withdraw, 3. for deposite,4.for end");
            
             a=input.nextInt();
            switch(a)
            {
                case 1:
                System.out.println("the balance is" +balance);
                break;
                case 2:
                System.out.println("Enter withdraw amount");
                withdraw=input.nextInt();
                if(withdraw<balance)
                {
                    balance=balance-withdraw;
                    System.out.println("Your remaining balace is" +balance);
                }
                else{
                    System.out.println("insufficient balance");
                    }
                    break;
                case 3:
                System.out.println("enter deposite amount");
                deposite=input.nextInt();
                balance=balance+deposite;
                System.out.println("Your balance is" +balance);
                break;
                
                default:
                System.out.println("enter a valid choice");
                break;
            }
        }

    }
}