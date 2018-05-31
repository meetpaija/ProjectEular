package Difficulty5Percent;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class BestParameter {

	
//		:::Question:::


//If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
//
//{20,48,52}, {24,45,51}, {30,40,50}
//
//For which value of p ≤ 1000, is the number of solutions maximised?

	
	public static void main(String[] args) {
		

		// System.out.println(Math.round(Math.cos(3.14*0/180)*100.0)/100.0);
		// System.out.println(Math.acos(20/52)*180/3.14);
		// System.out.println(Math.acos(48/52)*180/3.14);
		
		long startTime = System.currentTimeMillis();
		Map<Integer, Integer> result = new TreeMap<Integer, Integer>(Collections.reverseOrder()) ;

		for (int p = 1000; p > 0; p--) {
			int k = p / 2;
			int count = 0;
			for (int i = k - 1; i > 0; i--) {
				for (int j = i-1; j > 0; j--) {
					for (int m = j - 1; m > 0; m--) {
						if (m + j + i == p && (m * m) + (j * j) == (i * i))
							count++;
					}
				}
			}
			result.put(count, p);
		}
//		System.out.println(result);
		Object i = result.keySet().toArray()[0];
		System.out.println(result.get(i));
		long endTime   = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
