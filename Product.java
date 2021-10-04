class productpro 
{ 
 int pcode; 
 float price; 
 String pname; 
 void getdata(int x,float y,String z) 
 { 
 pcode=x; 
 price=y; 
 pname=z; 
 } 
 void show() 
 { 
 System.out.println("Product Code : "+pcode); 
 System.out.println("Product price : "+price); 
 System.out.println("Product name : "+pname); 
 } 
} 
public class Product 
{ 
 public static void main(String[] args) 
 { 
 productpro p1=new productpro(); 
 productpro p2=new productpro();  productpro p3=new productpro(); 
 
 p1.getdata(11,55000,"dell insperion"); 
 p2.getdata(12,80000,"Asus Rog"); 
 p3.getdata(13,75000,"Acer Nitro 7"); 
 System.out.println("The Product has lowest Price "); 
 System.out.println(""); 
 if((p3.price<p2.price) && (p3.price<p1.price)) 
 { 
 p3.show(); 
 } 
 else 
 { 
 if(p1.price<p2.price) 
 p1.show(); 
 else 
 p2.show(); 
 } 
 } 
}