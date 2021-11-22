package day32StringbuilderManipulation;

import java.time.LocalTime;

public class hiz {

	public static void main(String[] args) {
		// 1000 kere donecek bir loop yazalim
		// loop'da String ve StringBuilder kullanip
		// oncesinde ve sonrasinda zaman alalim
		// hizlarini karsilastiralim
		LocalTime zaman1 =LocalTime.now();
		System.out.println(zaman1);  		//22:17:39.181 481500
		
		String s="";
		
		for (int i = 1; i <=1000; i++) {
			s+=i;
		}
		System.out.print(s);
		System.out.println();
		LocalTime zaman2 =LocalTime.now();
		System.out.println(zaman2);			 //22:17:39.186 437300
		
		StringBuilder sb=new StringBuilder();
		
		
		for (int i = 0; i < 1000; i++) {
			sb.append(i);
		}
		System.out.print(sb);
		System.out.println();
		LocalTime zaman3 =LocalTime.now();
		System.out.println(zaman3);			 //22:17:39.187 437400
	}										// 5 kat hizli oldugunu görmüs olduk

}
