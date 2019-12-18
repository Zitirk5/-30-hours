import java.util.Scanner;
public class Atm
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int pin=0;
        int count=0;
        System.out.println("enter a pin");
        do{
            
            if(count<3){
                System.out.println("count=" +count);
                System.out.println("enter your pin again");
                pin= input.nextInt();
                count++;
                
            }
            else{
                System.out.println("blocked");
                break;
            }
            
        }while(pin !=123);
    }
}