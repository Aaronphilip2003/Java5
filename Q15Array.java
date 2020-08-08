import java.io.*;
class Q15Array
{
    public static void main(String bitch[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 names and their marks:");
        String a[]=new String[3];
        for(int i=0;i<3;i++)
        {
            a[i]=br.readLine();
        }
        for(int i=0;i<3;i++)
        {
        char ch=a[i].charAt(0);
        char ch1=a[i].charAt(a[i].length()-1);
        if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'))
        System.out.println(a[i]);
    }
    }
}