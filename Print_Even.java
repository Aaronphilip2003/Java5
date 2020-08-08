import java.io.*;
class Print_Even
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.print("------------------------------------------------------------------------------------------------------");
        for(int i=0;i<10;i++)
        if(a[i]%2==0)
        System.out.println(a[i]);
    }
}