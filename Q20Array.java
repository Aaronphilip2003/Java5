import java.io.*;
class Q20Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];
        int even[]=new int[10];
        int odd[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]%2==0)
            even[i]=a[i];
            else
            odd[i]=a[i];
        }
        System.out.println("ODD");
        for(int i=0;i<odd.length;i++)
        {
            System.out.print(odd[i]+"  ");
        }
        System.out.println();
        System.out.println("EVEN");
        for(int i=0;i<even.length;i++)
        System.out.print(even[i]+" ");
    }
}
            