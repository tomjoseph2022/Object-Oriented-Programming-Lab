import java.util.*;
public class matrixadd{
    public static void main(String[] args) {
        int row,col,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        row=sc.nextInt();
        System.out.println("enter the col");
        col=sc.nextInt();



        int mat1[] []=new  int[row] [col];
        int mat2[] []=new  int[row] [col];
        int mat3[] []=new  int[row] [col];
        System.out.println("Enter the elements of first matrix :");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat1[i][j]=sc.nextInt();
               
            }
            System.out.println();
        }

        System.out.println("Enter the elements of second matrix :");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat2[i][j]=sc.nextInt();
               
            }
            System.out.println();
        }


        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
               mat3[i][j]=mat1[i][j] + mat2[i][j];
               
            }
            

            System.out.println("the sum of matrix :");
            for(i=0;i<row;i++){
                for(j=0;j<col;j++){
                    System.out.println(mat3[i][j]+"\t");
                   
                }
            }
    
                System.out.println();
            
        
    }
}
}