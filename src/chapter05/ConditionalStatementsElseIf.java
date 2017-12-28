package chapter05;

public class ConditionalStatementsElseIf {

	public static void main(String[] args) {
		int totalmark;
		totalmark= 300;
		
		if (totalmark>=600) {
			System.out.println("You get first division out of 1000 marks");
		}
		else if (totalmark<600 && totalmark>=450) {
			System.out.println("You get second division");
		}
		else if (totalmark<450 && totalmark>=330) {
			 System.out.println("You get third division");
		 }
		else {System.out.println("you fail");

	}


	}
	}


