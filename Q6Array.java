import java.io.*;
class Q6Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
            int c=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                c++;
            }
            if(c==2)
            System.out.println(a[i]);
        }
    }
}
            