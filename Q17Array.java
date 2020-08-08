import java.io.*;
class Q17Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 names:");String s="";
        String a[]=new String[3];
        for(int i=0;i<3;i++)
        {
            a[i]=br.readLine();
        }
        for(int i=0;i<3;i++)
        {
            String s1="";
            s=a[i];
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                s1=ch+s1;
            }
            if(s1.equals(a[i]))
            System.out.println(a[i]);
        }
    }
}
                
            