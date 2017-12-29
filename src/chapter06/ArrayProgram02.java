package chapter06;

public class ArrayProgram02 {

	public static void main(String[] args) {
		
		
		int Roll [] = {101, 102, 103, 104, 105};
		
		int L= Roll.length;
		
		System.out.println("Roll.length = "+ L);
		for ( int i=0; i<L;i++) {
			 System.out.println("Roll["+i+"]= " + Roll[i]);
		}

	}

}
