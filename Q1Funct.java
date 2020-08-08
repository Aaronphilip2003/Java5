import java.io.*;
class Q1Funct
{
    static void cube(int n)
    {
        int cb=n*n*n;
        System.out.println(cb);
    }
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
        cube(a[i]);
    }
}