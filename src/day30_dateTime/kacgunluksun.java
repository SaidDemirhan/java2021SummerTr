package day30_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class kacgunluksun {

	public static void main(String[] args) {
		
		
		LocalDate bugun=LocalDate.now();
		 LocalDate dt=LocalDate.of(1986, 01, 01);
	        System.out.println("bugunun tarihi : "+bugun);
	        System.out.println("faruk dt :"+dt);
	        Period yasim=Period.between(dt, bugun);
	        System.out.println("said beyin yasi : "+yasim);
	        System.out.println(yasim.getYears());

	}

}
