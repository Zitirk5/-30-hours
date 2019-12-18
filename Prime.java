public class Prime
{
    public static void main(String[] args)
    {
        int num[];
        num=new int[100];
        System.out.println("stroring numbers from 1 to 100");
        for (int i=0; i<100; i++){
num[i]=i+1;
}
System.out.println("following are the numbers stored in array:");
for(int i=0; i<100; i++){
System.out.println(num[i]);
}
}
}        