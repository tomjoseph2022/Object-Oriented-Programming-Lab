public class Demo{
   double my_real;
   double my_imag;
   public Demo(double my_real, double my_imag){
      this.my_real = my_real;
      this.my_imag = my_imag;
   }
   public static void main(String[] args){
      Demo n1 = new Demo(76.8, 24.0),
      n2 = new Demo(65.9, 11.23),
      temp;
      temp = add(n1, n2);
      System.out.printf("The sum of two complex numbers is %.1f + %.1fi", temp.my_real,
      temp.my_imag);
   }
   public static Demo add(Demo n1, Demo n2){
      Demo temp = new Demo(0.0, 0.0);
      temp.my_real = n1.my_real + n2.my_real;
      temp.my_imag = n1.my_imag + n2.my_imag;
      return(temp);
   }
}