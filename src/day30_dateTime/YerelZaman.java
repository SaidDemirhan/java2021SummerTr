package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;


public class YerelZaman {

	public static void main(String[] args) {
		LocalTime saat=LocalTime.now();
		
		System.out.println(saat); //15:03:34.480035700
		
		System.out.println(saat.plusHours(3)); //18:04:46.003397200
		
		System.out.println(saat.minusHours(3)); //12:06:16.109237900
		
		System.out.println(saat.getMinute()); //7 
		
		System.out.println(saat.now(ZoneId.of("Japan"))); //22:11:56.682624400
		
		
	}

}
