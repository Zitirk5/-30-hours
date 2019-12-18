import java.util.Scanner;
    class Once{
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int a,b,sum,sub,mul;
            System.out.println("enter the value of a and b");
            a=sc.nextInt();
            b=sc.nextInt();
            sum=a+b;
            sub=a-b;
            mul=a*b;
            System.out.println("the sum of two number is"+sum);
             System.out.println("the multiplication of two number is"+mul);
              System.out.println("the subtraction of two number is"+sub);
        }
    }