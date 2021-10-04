
import java.util.*;
public class accent {
    public static void main(String[] args) {

        int n,i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the elements to be sort");
        n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter the elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
 
        }

        for ( i = 0; i < n; i++) {     
            for ( j = i+1; j < n; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        
        System.out.println("Elements of array sorted in ascending order: ");    
        for ( i = 0; i<n; i++) {     
            System.out.print(a[i] + " ");    
        }    
    }    
}  



        
    
    

