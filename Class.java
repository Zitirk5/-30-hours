import java.util.Scanner;
public class Class
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num[];
        System.out.println("Number of item you want to store");
        int len=sc.nextInt();
        num= new int[len];
        System.out.println("Enter "+len+" items");
        for (int i=0; i<len; i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Items stored in arrary are:");
        for(int i=0; i<len; i++){
            System.out.println("Item at num["+i+"]="+num[i]);
        }
    }
}
        