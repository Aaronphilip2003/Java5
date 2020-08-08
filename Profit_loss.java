import java.io.*;
class Profit_loss
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the cost price of the article");
        int cp=Integer.parseInt(br.readLine());
        System.out.println("Enter the selling price of the article");
        int sp=Integer.parseInt(br.readLine());
        if(sp>cp)
         {
             int p=sp-cp;
             System.out.println("Your profit is Rs."+p);
             int pperc=(p/cp)*100;
             System.out.println("Your profit percentage is "+pperc+" %");
            }
            else if (cp>sp)
            {
                int l=cp-sp;
                System.out.println("Your loss is Rs."+l); 
                int lperc=(l/cp)*100;
                System.out.println("Your loss percentage is "+lperc+"%");
            }
        }
    }
                