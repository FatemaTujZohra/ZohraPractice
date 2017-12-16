package chapter03;

public class Long09 {

	public static void main(String[] args) {
		long year= 10;
		long LightSpeedinmile= 186000 ;
		long Distance;
		Distance= year*365*24*60*60*LightSpeedinmile;
		
		System.out.print("In " + year);
		System.out.print(" years light will travel");
		System.out.print(" about "+ Distance + " miles");

	}

}
