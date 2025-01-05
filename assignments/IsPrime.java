package week1.assignments;

public class IsPrime {

	public static void main(String[] args) {
		int number = 13;
		boolean flag = true;
		
		for (int i=2 ; i <= number-1; i++) {
			if(number%i==0) {
				flag = false;
				break;
			} 
		}
		if (flag) {
			System.out.println("Number is a prime number");			
		} else {
			System.out.println("Number is not a prime number");	
		}

	}

}
