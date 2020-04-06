import java.util.*;
import java.io.*;

class arraylist
{
    static public void main(String args[]) throws IOException
    {
        BufferedReader in = null;
        List<String> myList = new ArrayList<String>();
            int i=0;
            try {   
                
                in = new BufferedReader(new FileReader("Harshit"));
                String str;
                
                while ((str = in.readLine()) != null) {
                if(i%2==1)
                {
        
                    myList.add(str);
                }

                i++;

                }
            } 
            
            catch (FileNotFoundException e) 
            {
                e.printStackTrace();
            } 
            
            catch (IOException e) 
            {
                e.printStackTrace();
            }
             
            finally
            {
                if (in != null)
                {
                    in.close();
                }
            }
                System.out.println(myList);
    }
}