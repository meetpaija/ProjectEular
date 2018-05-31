package Difficulty5Percent;

public class Find1001stPrime {
	private static int count = 1;

	public static void main(String[] args) {
		long n1 = 3;
		while(true) {
			if(isPrime(n1)) 
				count++;
			if(count==10001) break;
			n1+=2;
		}
		System.out.println(n1);
	}

	private static boolean isPrime(long n) {
		if (n % 2 == 0) {
			return false;
		}
		long temp = n;
		for (long i = 3; i <= Math.sqrt(n); i += 2) {
			if (temp % i == 0) {
				return false;
			}
		}
		return true;
	}

	

}
