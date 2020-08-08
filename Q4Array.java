import java.io.*;
class Q4Array
{
    public static void main(String ohyeah[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name runs of 4 players: ");
        int a[]=new int[4];int max=0;int flag=0;
        String n[]=new String[4];int k=0;
        for(int i=0;i<4;i++)
        {
            n[i]=br.readLine();
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<4;i++)
        {
        if(a[i]>max)
        {
            max=a[i];
            k=i;
        }
       }
       System.out.println(n[k]+"\t"+max);
    }
}
      