import java.util.Scanner;

public class exception1 {

   public static void main(String[] args) {
       //int num1=10,num2=0;
       Scanner in = new Scanner(System.in);

       
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();
      
        
        
        

        try{
            
            int output=num1/num2;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
        System.out.println ("You Shouldn't divide a number by zero");
        }
        int sum 		= num1 + num2;
        //int diff 	= num1 - num2;
        int pro 	= num1 * num2;
        int qu	= num1 / num2;
       
        

        
        System.out.println("Sum : "         + sum);
        System.out.println("Difference : "  + diff);
        System.out.println("Product : "     + pro);
        System.out.println("Quotient : "    + qu);
        
    }
}