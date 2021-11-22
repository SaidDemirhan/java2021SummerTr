package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class localTime {

	public static void main(String[] args) {
		LocalTime zaman=LocalTime.now();
		
		System.out.println("Aktuel zamanimiz :"+zaman);  //Aktuel zamanimiz :20:34:49.020988500

		System.out.println(LocalTime.of(12, 35, 23)); //12:35:23
		
		System.out.println("2 saat ileri 34 dk geri 45 sn ileri :"+
		zaman.plusHours(3).minusMinutes(34).plusSeconds(45));
		//2 saat ileri 34 dk geri 45 sn ileri :23:08:22.673957800
		
		for (int i = 0; i < 10000; i++) {// ne kadar hizli
			System.out.println(i);
		}
		
		LocalTime zaman2= LocalTime.now();
		System.out.println(zaman2);// 23:10:55.662182500
		
		//ulke saatleri hesaplama:
			ZonedDateTime japan= ZonedDateTime.now(ZoneId.of("Japan"));
			
			System.out.println(japan); //2021-08-03T03:52:00.965749800+09:00[Japan]
		
		
		
		
		
	}

}
