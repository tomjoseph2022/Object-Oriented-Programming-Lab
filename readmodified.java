import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.File;



public class readmodified {
    public static void main(String[] args) {

        String var="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the text to create file: type enter key 3 times to stop");
        while(!var.endsWith("\n\n\n"))
        var=var + scan.nextLine()+"\n";
        
        var=var+scan.nextLine()+"\n";

        try{
            //create file object
                File file=new File("output.txt");
                //create filewriter object
                FileWriter fw=new FileWriter(file);
                fw.write(var);
                fw.close();
                System.out.println("file writing code");
                FileReader fr = new FileReader("output.txt");
                String str = "";
                int i;
                while ((i = fr.read()) != -1){
                    //storing every characters in string
                    str += (char) i;
                }
                System.out.println(str);
                fr.close();

            }

            catch(IOException e)
            {
                System.out.println("there is io exception");
            }
     }
    
}
