import java.io.*;
class Q9Array
{
    public static void main(String bitch[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 names and their marks:");
        String a[]=new String[10];int flag=0;
        int b[]=new int[10];
        int i,j,temp;
        String temp1;
        for(i=0;i<10;i++)
        {
            a[i]=br.readLine();
            b[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(b[j]<b[j+1])
                {
                    temp1=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp1;
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        System.out.println("NAME"+"\t"+"MARKS");
        for(i=0;i<10;i++)
        System.out.println(a[i]+"\t"+b[i]);
    }
}