   class shape{
    public void display() {
        System.out.println("inside in the display function");
    }
}
class circle extends shape{
  
    public void show() {
    System.out.println("this is inside the show function");
       
    }
}
class rectangle extends circle{
    public void  find(){
        System.out.println("inside the find function");
    }
}
class inheritance{
    public static void main(String[] args) {
       // circle c=new circle();
        rectangle r=new rectangle();
        r.find();
        r.display();
        r.show();
        
    }
}