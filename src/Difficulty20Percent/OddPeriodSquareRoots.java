package Difficulty20Percent;

import java.util.ArrayList;
import java.util.List;

public class OddPeriodSquareRoots {
	
	private static List<Integer> result = new ArrayList<>();

	public static void main(String[] args) {
		int countResult = 0;
	
		for (int k = 2; k <= 10000; k++) {
			
			double sr = Math.sqrt(k);
			int count = 0;
			int diff = 0;
			
			if ((sr - Math.floor(sr)) == 0)
				continue;
			
			result.clear();
			run(k);
			
			for (int i = 1; i < result.size(); i++) {

				int x = i;
				int y = i + 1;
				boolean found = false;
				
				while (!found && y != result.size() - 1) {
					while (!found && y+1!=result.size()-1 && result.get(x).equals(result.get(y++))) {
						int tempy = y - 1;
						int tempx = x;
						while (!found && tempx + 1 <= result.size() - 1 && tempy + 1 <= result.size() - 1
								&& tempx + 1 <= tempy + 1) {
							if (count == 200) {
								diff = tempy - tempx;
								found = true;
							}
							if (result.get(tempx+1).equals(result.get(tempy+1))) {
								tempx++;tempy++;count++;
							}
							else
								break;
						}
					}
				}

				if (found)
					break;

			}

			if (diff % 2 == 1)
				countResult++;
			
		}
		
		System.out.println(countResult);
	}

	private static void run(int n) {
	
		int firstData = (int) Math.floor(Math.sqrt(n));
		int a = 1;
		int b = firstData;
		result.add(firstData);
		findSequence(a, b, firstData, n);

	}

	private static void findSequence(int a, int b, int data, int n) {
		
		if (result.size() > 1000)
			return;
		int newA = b;
		int newB = (n - b * b) / a;
		double temp = Math.sqrt(n) + newA;
		int newData = (int) Math.floor(temp / newB);
		result.add(newData);
		newA = newData * newB - newA;
		findSequence(newB, newA, newData, n);
	
	}

}
