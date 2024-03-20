package jsp.grooming4pm;

public final class LargestPalindromicNumber {

	public static String largestPalindrome(String num) {
		char[] digits = num.toCharArray();
		int[] frequency = new int[10];

		// Step 2: Count the occurrences of each digit
		for (char digit : digits) {
			frequency[digit - '0']++;
		}

		// Step 3: Find the middle digit(s)
		
		int middle = -1;
		for (int i = 0; i < 10; i++) {
			if (frequency[i] % 2 == 1) {
				middle = i;
				break;
			}
		}

		// Step 4: Construct the first half of the palindrome
		StringBuilder firstHalf = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
			int count = frequency[i] / 2;
			while (count > 0) {
				firstHalf.append((char) ('0' + i));
				count--;
			}
		}

		// Step 5: If the length is odd, append the middle digit
		StringBuilder palindrome = new StringBuilder(firstHalf);
		if (middle != -1) {
			palindrome.append((char) ('0' + middle));
		}

		// Step 6: Reverse the first half and append it to itself
		palindrome.append(firstHalf.reverse());

		return palindrome.toString();
	}

	public static void main(String[] args) {
		// Example 1
		String num1 = "444947137";
		System.out.println("Input: " + num1);
		System.out.println("Output: " + largestPalindrome(num1));

		// Example 2
		String num2 = "00009";
		System.out.println("\nInput: " + num2);
		System.out.println("Output: " + largestPalindrome(num2));
	}
}
