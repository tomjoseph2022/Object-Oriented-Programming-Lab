 class Employee {

    int empcode;
    String empname;
    String designation;
    float salary;
    void getdata(int x,String y,String z,float a)

    {
        empcode=x;
        empname=y;
        designation=z;
        salary=a;
    
    }
    void show()
    {
        System.out.println("employee code : "+empcode);
        System.out.println("employee name : "+empname);
        System.out.println("employee designation :"+designation);
        System.out.println("employee salary :"+salary);
    }
   
       



 public class worker
 {
    public static void main(String[] args)
     {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        

        e1.getdata(101, "ajo", "manager", 10000);
        e2.getdata(102, "dijo", "security", 20000);
        e3.getdata(103, "cijo", "plumber", 30000);
        
        

       
        
       System.out.println("\n");
        

        System.out.println("The employee has highest salary "); 
        System.out.println(""); 
        if((e3.salary>e2.salary) && (e3.salary>e1.salary)) 
        { 
            e3.show(); 
        } 
        else 
        { 
        if(e1.salary>e2.salary) 
        e1.show(); 
        else 
        e2.show(); 
        } 


    }
}
}
