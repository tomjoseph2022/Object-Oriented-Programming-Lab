import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.File;

public class copy {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the source file name");
    String source=scan.nextLine();
    //we use try block may the file not exist cause error
    try {
        FileReader fr=new FileReader(source);
        String str = "";
                int i;
                System.out.println("reading from file"+source);
                //reading file
                while ((i = fr.read()) != -1){
                    //storing every characters in string
                    str += (char) i;
                }
                System.out.println(str);
                System.out.println("\n Enter the file name to copy");
                String destination=scan.nextLine();
                File file=new File(destination);
                FileWriter fw=new FileWriter(file);
                fw.write(str);
                fr.close();
                fw.close();
                System.out.println("copied from "+source+"  to "+destination+" sccesfully");
    } catch (Exception e) {

        System.out.println("esception occured");
       
    }
}    
}
