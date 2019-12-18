import java.util.Scanner;
public class Arm
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num=input.nextInt();
        int count=0, number=num;
        int a, ori_num=num;
        double sum=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        while(number>0)
        {
        a= number%10;
        number=number/10;
        sum=sum+Math.pow(a,count);
    }
    if(sum==ori_num)
   {
       System.out.println("Armstrong");
    }
    else
    {
        System.out.println("Not armstrong");
    }
}
}


    
    
    
        