package chapter06;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int Roll [][]= new int [4][4];
		
		Roll[0][0]= 101;
		Roll[0][1]= 102;
		Roll[0][2]= 103;
		Roll[0][3]= 104;
		
		
		Roll[1][0]= 105;
		Roll[1][1]= 106;
		Roll[1][2]= 107;
		Roll[1][3]= 108;
		
		
		Roll[2][0]= 109;
		Roll[2][1]= 110;
		Roll[2][2]= 111;
		Roll[2][3]= 112;
		
		Roll[3][0]= 113;
		Roll[3][1]= 114;
		Roll[3][2]= 115;
		Roll[3][3]= 116;
		
		System.out.println("Elements of the Matrix is:");
		int L= Roll.length ;
		for (int i=0; i<L; i++) {
			
		for (int j=0; j<L; j++) {
			System.out.print(Roll[i][j]+ "\t");

	}
		System.out.println();
		}

	
	
	}


}


