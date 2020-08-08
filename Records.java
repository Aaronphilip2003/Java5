import java.io.*;
class Records
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int age[]=new int[10];
        String name[]=new String[10];
        int temp; 
        String temp1;
        System.out.println("Enter 10 people and their ages");
        for(int i=0;i<10;i++)
        {
         age[i]=Integer.parseInt(br.readLine());
         name[i]=br.readLine();
        }
        for(int i=0;i<9;i++)
        {
         for(int j=0;j<9-i;j++)
         {
             if(age[j]<age[j+1])
             {
                 temp=age[j];
                 age[j]=age[j+1];
                 age[j+1]=temp;
                 temp1=name[j];
                 name[j]=name[j+1];
                 name[j+1]=temp1;
                }
            }
        }
        for(int k=0;k<10;k++)
        {
            System.out.println(age[k] + " "+name[k] +" ");
        }
    }
}

          