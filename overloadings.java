public class overloadings {
    static int add(int x, int y){
        return x+y;
    }
    static double add(double x,double y){
        return x=y;
    }

    public static void main(String[] args) {
        int a=add(2,5);
        double b=add(2.5,8.2);
        System.out.println("integer function is :" +a);
        System.out.println("double funtion :"+b);
    }
}
