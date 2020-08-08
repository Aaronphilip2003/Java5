import java.io.*;
class Q3Array
{
    public static void main(String ohyeah[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 temperatures in fahrenheit: ");
        double a[]=new double[5];
        double c[]=new double[5];
        for(int i=0;i<5;i++)
        {
            a[i]=Double.parseDouble(br.readLine());
        }
        for(int i=0;i<5;i++)
        {
        c[i]=(a[i]-32)/1.8;
        }
        for(int i=0;i<5;i++)
        System.out.println(c[i]);
    }
}