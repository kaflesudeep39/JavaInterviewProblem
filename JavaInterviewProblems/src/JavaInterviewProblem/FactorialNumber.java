package JavaInterviewProblem;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int number = 5; 
		
		System.out.println(getFactorialNumber1(number));
		
		//System.out.println(getFactorialNumber2(number));

	}

	private static int getFactorialNumber2(int number) {
		if(number==0)return 1; 
		
		return number*getFactorialNumber2(number-1);
	}

	private static int getFactorialNumber1(int number) {
		int sum = 1; 
		while (number>0){
			sum = sum * (number--); 
			
		}
		return sum;
	}

}
