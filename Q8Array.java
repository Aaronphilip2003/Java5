import java.io.*;
class Q8Array
{
    public static void main(String ohyeah[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name and telephone numbers ");
        String a[]=new String[4];int i,j,temp;String temp1;
        int b[]=new int[4];
        for(i=0;i<4;i++)
        {
            a[i]=br.readLine();
            b[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3-i;j++)
            {
                if(a[j].compareToIgnoreCase(a[j+1])>0)
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                    temp1=a[j];
                    a[j]=a[j+1];
                    a[j]=temp1;                    
                }
            }
        }
        System.out.println("NAMES"+"\t"+"TELEPHONE NUMBER");
        for(i=0;i<4;i++)
        System.out.println(a[i]+"\t"+b[i]);
    }
}
        