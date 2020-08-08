import java.io.*;
class Prime101
{
    static boolean checkPrime(int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
        if(a%i==0)
        c++;
        if(c==2)
        return true;
        else 
        return false;
    }
   public static void main(String args[])throws IOException
   {
       BufferedReader aaron=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a number to check if it is a prime number or not");
       int a=Integer.parseInt(aaron.readLine());
       boolean b=checkPrime(a);
       if(b==true)
       System.out.println("Prime number");
       else
       System.out.println("NOT A PRIME NUMBER");
    }
}
    