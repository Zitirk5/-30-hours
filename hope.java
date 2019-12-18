import java.util.Scanner;
public class Hope
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[2][3];
        System.out.println("Enter the elements of matrix 2 X 3 ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Following are the elements 2 X 3");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(  );
        }
    }
}