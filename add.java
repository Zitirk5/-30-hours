import java.util.Scanner;
public class Add
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[2][3];
        int [][]b=new int[2][3];
        int [][]c=new int[2][3];
        System.out.println("Enter the elements of matrix 2 X 3 ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matix 2 x 3");
         for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("adding first and second matrix 2 X 3");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
            {
               c[i][j]=a[i][j] + b[i][j];
            }
        }
            System.out.println("Result of addition matrix 2 X 3");
            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                    System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
}
}

    
