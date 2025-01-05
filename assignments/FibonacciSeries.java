package week1.assignments;

public class FibonacciSeries {
    
	public static void main(String[] args) {
		int series1 = 0;
		int series2 = 1;
		for(int i=1; i<=8; i++) {
			System.out.println(series1);
			int temp = series1 + series2;
			series1 = series2;
			series2 = temp;
		} 

	}

}
