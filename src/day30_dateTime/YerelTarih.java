package day30_dateTime;

import java.time.LocalDate;

public class YerelTarih {

	public static void main(String[] args) {
		LocalDate tarih =LocalDate.now();
		
		System.out.println(tarih); //2021-08-03
		
		System.out.println(tarih.plusDays(3)); //2021-08-06

		System.out.println(tarih.minusDays(3)); //2021-08-06
		
		System.out.println(tarih.getMonth());   //AUGUST
		
		System.out.println(tarih.getMonthValue());  //8
		
		System.out.println(tarih.getDayOfWeek());  //TUESDAY
		
		System.out.println(tarih.getDayOfMonth()); //3
		
		System.out.println(tarih.getDayOfYear());  //215
		
		System.out.println(tarih.isLeapYear());		//false
		
		LocalDate tarih2 = LocalDate.of(1986, 5, 1);
		
		System.out.println(tarih.isAfter(tarih2)); //true
		
		System.out.println(tarih2.isBefore(tarih)); //true
		
	}

}
