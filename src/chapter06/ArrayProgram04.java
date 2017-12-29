package chapter06;

public class ArrayProgram04 {

	public static void main(String[] args) {
		int Roll[];
		Roll= new int [7];

		Roll[0]= 101;
		Roll[1]= 102;
		Roll[2]= 103;
		Roll[3]= 104;
		Roll[4]= 105;
        
		
       int L= Roll.length;
		
		System.out.println("Roll.length = "+ L);
		
		for ( int i=0; i<L;i++) {
			 System.out.println("Roll["+i+"]= " + Roll[i]);

	}

}
}