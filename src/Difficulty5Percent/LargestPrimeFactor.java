package Difficulty5Percent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



//			---Question---

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?




public class LargestPrimeFactor {
	public static List<Long> primes = new ArrayList<>();

	public static void main(String[] args) {
		findPrimeFactor();
		Collections.sort(primes, Collections.reverseOrder());
		primes.forEach(System.out::println);
	}

	private static void findPrimeFactor() {
		long n = 600851475143L;
		if (n % 2 == 0) {
			primes.add((long) 2);
			n /= 2;
		}
		long temp = n;
		for (long i = 3; i < Math.sqrt(n); i += 2) {
			if (temp % i == 0) {
				primes.add(i);
				temp /= i;
			}
		}
	}

}
