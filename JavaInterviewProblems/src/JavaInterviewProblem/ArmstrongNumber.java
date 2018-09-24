package JavaInterviewProblem;

public class ArmstrongNumber {

	public static void main(String[] arga) {
		int armstrongNumber = 153;

		System.out.println(testArmstrong(armstrongNumber));
	}

	public static boolean testArmstrong(int armstrongNumber) {

		int sum = 0;
		int a = armstrongNumber;
		while (a > 0) {
			int rem = a % 10;
			sum = sum + (int) Math.pow(rem, 3);
			a = a / 10;
		}

		return sum == armstrongNumber;
	}
}
