import java.util.*;  
class publisher{
    public void display() {
        Scanner sc= new Scanner(System.in);  
        
        System.out.print("Enter name of the book  ");  
        String str= sc.nextLine();  
        System.out.println(" The publisher of the book :" + str);
    }
}
class book extends publisher{
  
    public void show() {
    
    Scanner sc= new Scanner(System.in);  
        
    System.out.print("Enter title of the book ");  
    String as= sc.nextLine();  
    System.out.println(" The title of the book :" + as);


       
    }
}
class litertater extends book{
    public void  find(){
        
    Scanner sc= new Scanner(System.in);  
        
    System.out.print("Enter price of the book ");  
    int a= sc.nextInt();  
    System.out.println(" The price of the book :" + a);
    }
}
class fiction extends litertater{
    public void visible() {
      
    Scanner sc= new Scanner(System.in);  
        
    System.out.print("Enter the type of  fiction in the book ");  
    String bc= sc.nextLine();  
    System.out.println(" the type of fiction in the book :" + bc);
    


    }
    
}
class publisher_inheritance{
    public static void main(String[] args) {
       
        fiction f=new fiction();
        
        f.display();
        f.show();
        f.visible();
        f.find();
        
    }
}