package JavaInterviewProblem;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		int howManyArmstongNum = 6;
		getArmstrongNumber(howManyArmstongNum);

	}

	private static void getArmstrongNumber(int howManyArmstongNum) {
		int i = 1;
		int j = 0;
		while (j != howManyArmstongNum) {

			if (ArmstrongNumber.testArmstrong(i)) {
				System.out.println(i);
				j++;
			}
			i++;
		}

	}

}
