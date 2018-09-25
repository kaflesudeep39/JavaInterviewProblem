package JavaInterviewProblem;

public class PatternPrinting {

	public static void main(String[] args) {

		int number = 7;
		String pattern[] = new String[(number + 1) / 2];
		String pattern2[] = generatePattern(pattern, number);

		for (int i = 0; i < number; i++) {
			if (i < number / 2) {
				System.out.println(pattern2[i]);

			} else {
				System.out.println(pattern2[6 - i]);
			}
		}

	}

	private static String[] generatePattern(String pattern[], int number) {

		for (int i = 1, k = 1, l = 0; i <= number; i += 2, k++, l++) {
			String s = "";
			for (int j = 1; j <= 8; j++) {
				if (j <= k || (8 - j) < k) {
					s = s + i + " ";
				} else {
					s = s + "0 ";
				}
			}
			pattern[l] = s;
		}
		return pattern;

	}

}
