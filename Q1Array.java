import java.io.*;
class Q1Array
{
    public static void main(String ohyeah[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers: ");
        int a[]=new int[10];int sum=0,avg=0;
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
            sum=sum+a[i];
        }
        System.out.println("NUMBERS IN REVERSED ORDER ARE: ");
        for(int i=9;i>=0;i--)
        System.out.println(a[i]);
        System.out.println("SUM AND AVERAGE");
        System.out.println(sum);
        avg=sum/10;
        System.out.println(avg);
    }
}
        