public class arrayofobject {
    public static void main(String[] args) {
        product[] o=new product[5];
        o[0]=new product(11,"cup");
        o[1]=new product(12,"soap");
        o[2]=new product(14,"gel");
        o[3]=new product(16,"mask");
        o[4]=new product(17,"pen");
        
        System.out.println("the product details are :");
       int  n=5;
        for(int i=0;i<n;i++){
        o[i].display();
        }
    }
    
}
class product{
    int pro_price;
    String pro_name;
    product(int pr,String name){
        pro_price=pr;
        pro_name=name;


    }

    public void display() {
        System.out.println("product price :"+pro_price);
        System.out.println("product name is "+pro_name);
        System.out.println();
    }

}
