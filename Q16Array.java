import java.io.*;
class Q16Array
{
    public static void main(String bitch[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 names");
        String a[]=new String[3];String s="";String s1="";String k="";
        for(int i=0;i<3;i++)
        {
            a[i]=br.readLine();
            s=s+a[i].charAt(0);
        }
        System.out.println(s);
        for(int j=65;j<=90;j++)
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch==(char)j||ch==(char)(j+32))
                s1=s1+ch;
            }
        }
        System.out.println(s1);
    }
}