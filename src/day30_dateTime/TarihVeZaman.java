package day30_dateTime;

import java.time.LocalDateTime;

public class TarihVeZaman {

	public static void main(String[] args) {
		LocalDateTime zaman= LocalDateTime.now();
		
		System.out.println(zaman); //2021-08-03T15:33:04.367208300
		
		String yil= zaman.toString();
		
		System.out.println(yil.startsWith("2021")); //true

	}

}
