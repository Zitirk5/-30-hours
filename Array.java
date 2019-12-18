import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int size=input.nextInt();
        int  sum=0, i, average;
        int a[];
       a=new int[size];
       System.out.println("enter the elements");
       for(i=0; i<size; i++)
       {
           a[i]=input.nextInt();
           sum=sum+a[i];
        }
        System.out.println("the sum is" +sum);
        average=sum/size;
        System.out.println("the average is" +average);
       
       
    }
}
        