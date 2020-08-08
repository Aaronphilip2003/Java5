import java.io.*;
class Q7Array
{
    public static void main(String ohyeah[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name runs of 4 players: ");
        int flag=0;
        String n[]=new String[4];int k=0;
        for(int i=0;i<4;i++)
        {
            n[i]=br.readLine();
        }
        System.out.println("Enter the name to be searched:");
        String search=br.readLine();
        for(int i=0;i<4;i++)
        {
            if(search.equalsIgnoreCase(n[i]))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("SC");
        else
        System.out.println("UNSC");
    }
}
            