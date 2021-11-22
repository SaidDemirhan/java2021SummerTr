package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);  //2021-08-02T20:57:57.894550900

		LocalDate d= LocalDate.of(2016, 1, 1);
		LocalTime t=LocalTime.of(13, 30);
		
		LocalDateTime ldt1=LocalDateTime.of(d, t);
		
		System.out.println(d); //2016-01-01
		System.out.println(t); //13:30
		
		System.out.println(ldt1); //2016-01-01T13:30
		
		System.out.println(ldt.getHour()); //21 //sadece saatii getirdi
		
	}

}
