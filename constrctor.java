public class constrctor {
    int x;
    int y;
    public constrctor(int a, int b){
        x=a;
        y=b;
 }


public static void main(String[] args) {
    constrctor o=new constrctor(2,8);
    System.out.println("the value is : " +o.x);
    System.out.println("the value is : " +o.y);
}
}
