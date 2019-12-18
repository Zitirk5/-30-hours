import java.util.Scanner;
public class El
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num[];
        System.out.println("Number of item you want to store");
        int len=sc.nextInt();
        int max;
        num= new int[len];
        System.out.println("Enter "+len+" items");
        for (int i=0; i<len; i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Items stored in arrary are:");
        for(int i=0; i<len; i++){
            System.out.println("Item at num["+i+"]="+num[i]);
        }
        max = num[0];
        for(int i=1; i<len; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("the largest item="+max);
    }
}
        