import java.io.*;
class Prime_numbers
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
        for(int i=0;i<10;i++)
        {
            int c=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                c++;
            }
           int c1=0;
            if(c==2)
            c1=c1+1;
        System.out.println("The number of prime numbers are: "+c1);
    }
}
    }

