package chapter04;

public class BinarysArithmeticOperator05 {

	public static void main(String[] args) {
		int a, b, c, result;
		float d;
		a= 5;b=10; c=30;
		d= (float)c/(float)b;
		
		System.out.println("Division: c/b = "+d);
		result= c%b; 
		System.out.println("Modulo: c%b = "+ result);
		result= a*b+c;
		System.out.println("Multiplication and plus expression: a*b+c = "+ result);

	}

}

