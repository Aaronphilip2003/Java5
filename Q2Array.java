import java.io.*;
class Q2Array
{
    public static void main(String ohyeah[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 countries and capitals ");
        String a[]=new String[3];
        String b[]=new String[3];
        for(int i=0;i<3;i++)
        {
            a[i]=br.readLine();
            b[i]=br.readLine();
        }
        System.out.println("COUNTRY"+"\t"+"CAPITAL");
        for(int i=0;i<3;i++)
        System.out.println(a[i]+"\t"+b[i]);
    }
}