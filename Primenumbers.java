import java.io.*;
class Primenumbers
{
    public static void main(String args[])throws IOException
    {
        int i=0;
        int num=0;
        for(i=1;i<=100;i++)
        {
            int c=0;
            for(num=1;num<=i;num++)
            {
                if(i%num==0)
                {
                    c++;
                }
            }
            if(c==2)
            System.out.print(i+" ");
        }
    }
}