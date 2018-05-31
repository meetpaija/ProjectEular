package Difficulty5Percent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*				---Question---
 * 
 * 
 * A palindromic number reads the same both ways.
 *  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */


public class LargestPalindromeProduct {
	public static List<Long> result = new ArrayList<>();

	public static void main(String[] args) {

		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				if (isPalindrome((long) (i * j))) {
					result.add((long) (i * j));
				}
			}
		}

		Collections.sort(result, Collections.reverseOrder());
		result.forEach(System.out::println);
	}

	private static boolean isPalindrome(long i) {
		String num = Long.toString(i);
		StringBuilder numSB = new StringBuilder(num);
		StringBuilder revSB = new StringBuilder(numSB);
		numSB.reverse();
		int jnum = Integer.parseInt(numSB.toString());
		int jrev = Integer.parseInt(revSB.toString());
		if (jnum == jrev)
			return true;
		return false;
	}

}
