import java.io.*;
class Replace_String
 {
     public static void main(String args[])throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a string");
         String s=br.readLine();
         s=s+" ";
         int len=s.length();
         String s1="",w="";
         for(int i=0;i<len;i++)
         {
             char ch=s.charAt(i);              
             if(s1.equalsIgnoreCase("blue"))
              {
                System.out.print("red");
                s1=s1+" "+w;
            }
            else
            w=w+ch;
            
        }
        System.out.println(s1);
    }
}
        
            
             
               

         
         
         