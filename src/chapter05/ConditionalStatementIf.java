package chapter05;

public class ConditionalStatementIf {

	public static void main(String[] args) {
		int totalmark;
		totalmark= 330;
		
		if (totalmark>=600) {
			System.out.println("You get first division out of 1000 marks");
		}
		if (totalmark<600 && totalmark>=450) {
			System.out.println("You get second division");
		}
		 if (totalmark<450 && totalmark>=330) {
			 System.out.println("You get third division");
		 }

	}

}
