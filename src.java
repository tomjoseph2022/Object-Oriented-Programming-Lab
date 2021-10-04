//array of object home work
import java.util.*; 
public class src 
{ 
public static void main(String[] args) 
{ 
int i,k=0; 
Scanner s=new Scanner(System.in); 
System.out.println("enter no of employees"); 
int n=s.nextInt(); 
System.out.println(n); 
employ[] em=new employ[10]; 
System.out.println("enter employees details"); 
for(i=0;i<n;i++) 
{ 
System.out.println("enter employee no"); 
int empno=s.nextInt(); 
s.nextLine(); 
System.out.println("enter employee name"); 
String empname=s.nextLine(); 
System.out.println("enter employees salary"); 
int empsal=s.nextInt(); 
em[i]= new employ(empno,empname,empsal); 
} 
System.out.println("enter employee no to be searched"); 
int ep=s.nextInt(); for(i=0;i<n;i++) 
{ 
if(ep==em[i].eno) 
{ 
k++; 
em[i].display(); 
break; 
} 
else 
{ 
k=0; 
} 
} 
if(k>0) 
{ 
System.out.println("employee found"); 
} 
else 
{ 
System.out.println("employee not found"); 
} 
s.close(); 
}} 
class employ 
{ 
int eno,sal; 
String ename; 
employ(int x,String y,int z) 
{ 
eno=x; ename=y; 
sal=z; 
} 
void display() 
{ 
 System.out.println("Employee Number : "+eno); 
 System.out.println("Employee Name : "+ename); 
 System.out.println("Employee Salary : "+sal); 
} 
}