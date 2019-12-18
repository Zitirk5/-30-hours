import java.util.Scanner;
public class Ha
{
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);

       System.out.println("enter a character");
       char so=input.next().charAt(0);
       if(so=='A'){
           System.out.println("Success");
        }
     else{
            System.out.println("Wrong");
        }
    }
}