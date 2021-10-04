class areofshaping
{
    void area(float x)
    {
        System.out.println("Area of the square: "+x*x+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    void area(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" sq units");
    }
    void area(int x)
    {
        //float area=6*z*z;
        System.out.println("area of cube:"+6*x*x);
    }
    void area(int x,int y)
    {
        System.out.println("the surface area of cone : "+3.14*x*2 + 3.14*x*y);
    }
    void area(double x,double y)
    {
        System.out.println("the volume of cylinder : "+ 3.14*x*x*y);
    }
    public static void main(String args[]){

        areofshaping ob = new areofshaping();
       
       
	 ob.area(6.1);
	   
	 
	 ob.area(10,22);
	
	 ob.area(6.1);
     ob.area(4);
     ob.area(2,8);
     ob.area(4.5,7.8);
    }
}