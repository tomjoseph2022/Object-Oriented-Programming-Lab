class Outer{
    int x=10;
    static class Inner{
        int y=12;
    }
}

public class  main1 {
     public static void main(String[] args) {
        Outer.Inner I=new Outer.Inner();
        System.out.println(I.y);
        
     
    
    }
}