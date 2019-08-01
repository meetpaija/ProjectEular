package Difficulty20Percent;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class DiophantineEquation {

	public static void main(String[] args) {
		Map<Long,Integer> result=new TreeMap<>(Collections.reverseOrder());
		for (int d = 2; d <=1000; d++) {
			
			double sr = Math.sqrt(d);
			
			if ((sr - Math.floor(sr)) == 0)
				continue;
//			int d=61;
			long x = (long) Math.ceil(Math.sqrt(d + 1));
			double y = 0d;
//			System.out.println(x);
//			int count=0;
			while (true) {
//				if(count<2000000) {
				double temp = (double) ((x * x) - 1) / d;
				y = Math.sqrt(temp);

				if (y - Math.floor(y) == 0)
					break;
				x++;
//				count++;
//				}else if(count==200000){
//					count++;x=0;y=1;
//				}else {
//					double temp=(double)((y*y)*d+1);
//					double newx =Math.sqrt(temp);
//
//					if (newx - Math.floor(newx) == 0) {
//						x=(long) newx;break;}
//					y++;count++;
//				}
			}
			result.put(x, d);
		}
		System.out.println(result);
		
	}
	

}
