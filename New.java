import java.util.Scanner;
public class New
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        boolean flag=true;
        int balance=0;
        int withdraw, deposite, a;
        while(flag)
        {
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
                }
                else{
                    System.out.println("insufficient balance");
                    }
                    break;
                case 3:
                System.out.println("enter deposite amount");
                deposite=input.nextInt();
                deposite=balance+deposite;
                break;
                case 0:
                flag=false;
                break;
                default:
                System.out.println("enter a valid choice");
                break;
            }
        }
    }
}