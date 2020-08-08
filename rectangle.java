import java.io.*;
class rectangle
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,p,b;
        int l;
        System.out.println("Please enter the length of the rectangle");
        l=Integer.parseInt(br.readLine());
        System.out.println("Please enter the breadth of the rectangle");
        b=Integer.parseInt(br.readLine());
        a=l*b;
        p=2*(l+b);
        System.out.println("The area of the rectangle is " +a);
        System.out.println("The perimeter of the rectangle is " +p);
    }
}
        