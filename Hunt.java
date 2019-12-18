import java.util.Scanner;
public class Hunt
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        int count=0, number=num, a;
        double sum=0;
        int ori_num=num;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        while(number>0)
        {
            a=number%10;
            number=number/10;
            sum=sum*10+a;
        }
        if(ori_num==sum)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
        