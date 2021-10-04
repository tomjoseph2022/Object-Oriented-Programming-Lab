
class arith{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 0;
        System.out.println("The numbers are 5 and 0");
		try {
			System.out.println(a / b); 
		}
		catch (ArithmeticException e) {
		
			System.out.println(
				"Divided by zero operation cannot possible");
		}
           int sum= a + b;
           System.out.println("sum of two number is  :"+sum);
            int diff= a - b;
           System.out.println("difference   of two number is   :"+diff);
            int mul= a * b;
           System.out.println("product  of two number is      :"+mul);


	}
}
