import java.util.Scanner;
public class Calc
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter one number");
        int a=input.nextInt();
        System.out.println("enter operation");
        String operation=input.next();
        System.out.println("Enter one number");
        int b=input.nextInt();
        int result=0;
        System.out.println(result);
        char operation1=operation.charAt(0);
        switch(operation1)
        {
            case '+':
            result=a+b;
            break;
            case '-':
            result=a-b;
            break;
            case '*':
            result=a*b;
            break;
            case '/':
            result=a/b;
            break;
            default:
            System.out.println("Enter valid operation");
        }
        System.out.println("result " +result);
    }
}
           