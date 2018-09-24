package JavaInterviewProblem;

public class fibonacciSeries {

	public static void main(String [] args){
		//1 1 2 3 5 8 13
		int limit= 20;
		for(int i = 1; i<=limit; i++){
			System.out.println(getfib(i));
				}
		
		 
		
	}

	private static int getfib(int i) {
		int fib_number= 0; 
		int first = 1; 
		int second= 1;
	
		if(i==1||i==2){
			return first;
		}
		 
		for ( int j =3; j<=i; j++){
			fib_number = first+ second; 
		 
			first= second; 
			second = fib_number; 
		}
		return fib_number; 
	
	}
	
}

