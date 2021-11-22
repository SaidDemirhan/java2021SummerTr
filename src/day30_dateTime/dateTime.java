package day30_dateTime;

import java.time.LocalDate;

public class dateTime {

	public static void main(String[] args) {
		LocalDate tarih= LocalDate.now();	//new anahtari kullanmaya gerek yok	(class,=constructor)
		//tarih isminde obje olusturduk
		
		System.out.println("bugunun tarihi: "+tarih); 		//bugunun tarihi: 2021-08-02
		
		System.out.println(tarih.plusDays(21));     //021-08-23
		
		System.out.println(tarih.plusYears(3));		//2024-08-02
		
		System.out.println(tarih.plusMonths(3));	//2021-11-02
		
		System.out.println("bugunden 3 gun 5 ay 2yil sonrasi: "+tarih.plusDays(3).plusMonths(5).plusYears(2));
		//bugunden 3 gun 5 ay 2yil sonrasi: 2024-01-05
		System.out.println("40 gun öncesi: "+tarih.minusDays(40)); //40 gun öncesi: 2021-06-23
	
		System.out.println("bugunun 5 yil öncesi 2 ay sonrasi 3 hafta ertesi :"+
		tarih.minusYears(5).plusMonths(2).plusWeeks(3)); //bugunun 5 yil öncesi 2 ay sonrasi 3 hafta ertesi :
		//2016-10-23
	
		/* LocalDate classindan uretilen obje method chain(method ekleme) kuralina uyar.
		 * methodlar ayni (homojen) olmak zorunda degildir.
		 * 
		 */
	
		System.out.println(tarih.getDayOfMonth());  //2  //bugünun 2 sini getirdi
	
		System.out.println(tarih.getDayOfWeek()); //MONDAY
		
		System.out.println(tarih.getMonthValue()); //8 agustos ayinda oldugumuzu yazdirdi
		
		System.out.println(tarih.getMonth());  //AUGUST 
		
		
		LocalDate dogumGunu=LocalDate.of(1986, 5, 20);
		
		System.out.println("dogumgunu: "+dogumGunu);     //dogumgunu: 1986-05-20
		
		System.out.println("dogumgunu: "+dogumGunu.getDayOfWeek()); //dogumgunu: TUESDAY
		
		System.out.println(tarih.isAfter(dogumGunu)); //true
		
		System.out.println(dogumGunu.isBefore(tarih)); //true
		
		System.out.println("buyil artik yil mi"+tarih.isLeapYear());//false
		
	}

}
