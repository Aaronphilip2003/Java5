import java.io.*;
class Q11Array
{
    public static void main(String bitch[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 names and their marks:");
        String a[]=new String[10];int flag=0;
        int i,j;
        String temp;
        for(i=0;i<10;i++)
        {
            a[i]=br.readLine();
        }
         for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(a[j].compareToIgnoreCase(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<10;i++)
        System.out.println(a[i]);
    }
}
        