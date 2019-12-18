import java.util.Scanner;
public class Again
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int num;
        num=input.nextInt();
        int flag=0;
        System.out.println("stroring numbers from 1 to 100");
        for (int i=0; i<100; i++)
        {
            if(num%i==0)
            {
                flag=1;
                System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }
        }
    }
}
            
                