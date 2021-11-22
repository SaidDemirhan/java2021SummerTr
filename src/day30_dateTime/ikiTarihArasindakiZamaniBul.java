package day30_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class ikiTarihArasindakiZamaniBul {

	public static void main(String[] args) {
		
		LocalDate tarih1= LocalDate.now();
		
		LocalDate tarih2= LocalDate.of(1986, 5, 1);
		
		Period yas =Period.between(tarih2, tarih1); //P35Y3M2D
		
		System.out.println(yas);
		
		//eger sadece yasi bilmek istersek;
		
		int sadeceYas =Period.between(tarih2, tarih1).getYears();
		
		System.out.println("Yasiniz: "+sadeceYas);

	}

}
