package day30_dateTime;

import java.time.LocalDate;
import java.text.DateFormat;

import java.time.Period;


public class ClassDateTimeFormatter {

	public static void main(String[] args) {
		 LocalDate bugun=LocalDate.now();
	        LocalDate date=LocalDate.of(2020, 11, 15);


        /*
         * yy: YILIN SON iki RAKAMI
         * yyyy : yilin tamamini
         * y : yilinn tamamini
         * M : ay sirasini verir TEMMUZ için : 7
         * MM:  ay sirasini veriri TEMMUZ için : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamamini verir
         */
       /* 
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");//15/11/20
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yy");//15/05/20
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yy");//02/Agu/21
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd$M$yyyy");//15$5$2020
        
        System.out.println(dtf.format(date));
        System.out.println(dtf1.format(date));
        System.out.println(dtf2.format(tarih));
        System.out.println(dtf3.format(date));
     */   //calismadi
 //kac yasındayiz
        
        LocalDate dt=LocalDate.of(2005, 03, 05);
        System.out.println("bugunun tarihi : "+bugun);
        System.out.println("faruk dt :"+dt);
        Period yasim=Period.between(dt, bugun);
        System.out.println("faruk beyin yasi : "+yasim);
        System.out.println(yasim.getYears());
    }
}
