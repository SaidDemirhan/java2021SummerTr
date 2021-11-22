package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TarihSaatFormati {

	public static void main(String[] args) {
		
		DateTimeFormatter tarz = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		LocalDate tarih=LocalDate.now();
		
		/*
		 * M =Kacinci ay oldugu	(8)
		 * MM =Kacinci ay oldugu 2 rakam (08)
		 * MMM =Ayin ilk 3 harfi (Aug.)
		 * MMMM =Ay isminin tamami (August)
		 */
		
		System.out.println(tarih); //2021-08-03
		
		System.out.println(tarz.format(tarih)); //03/08/21
		
		System.out.println(tarz.format(tarih.plusMonths(2))); //03/10/21
		
		LocalTime saat=LocalTime.now();
		
		DateTimeFormatter tarz2 = DateTimeFormatter.ofPattern("hh:mm");
		
		System.out.println(tarz2.format(saat)); //03:54
		
		/*
		 * hh =12 saat formatinda
		 * HH =24 saat formatinda
		 * mm =dakika
		 */
		
	}

}
