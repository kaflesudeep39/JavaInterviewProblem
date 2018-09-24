package JavaInterviewProblem;

public class fibonacciSeries2 {

	public static void main(String[] args) {
		int limit = 10;
		int i = 1;
		while (i <= limit) {
			System.out.println(getFibNum(i));
			i++;
		}

	}

	private static int getFibNum(int i) {
		if (i == 1 || i == 2)
			return 1;
		return getFibNum(i - 1) + getFibNum(i - 2);
	}

}
