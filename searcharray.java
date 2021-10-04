import java.util.*;

public class searcharray {
    public static void main(String[] args) {
        int n,i,b,flag=0;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the size of the array");
       n=s.nextInt();
       int a[]=new int[n];
       System.out.println("enter the elements");
       for(i=0;i<n;i++){
           a[i]=s.nextInt();

       }
       System.out.println("enter the element to search");
       b=s.nextInt();
       for( i=0;i<n;i++){
           if(a[i]==b){
               flag=1;
               break;
            

           }
           else{
               flag=0;
           }

       }
       if(flag==1){
       
       System.out.println("element  found at postion :"+(i+1));
       }
       else{
           System.out.println("not found");
       }
    }
    
}
