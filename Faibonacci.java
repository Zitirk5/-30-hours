import java.util.Scanner;
public class Faibonacci
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a=0,b=1,c,i;
        System.out.println("Enterthe number of numbers to print");
        int num=input.nextInt();
        System.out.print("the faibonacci numbers are "+a+"\t"+b+"");
        for(i=1; i<num-2; i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print("\t"+c);
        }
    }
}