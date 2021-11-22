package day24_forEachLoops;

public class c4_eachForLoop {

	public static void main(String[] args) {
		/*
		 * Soru 1: Bir integer array olusturunuz ve bu array’deki tum sayilarin
		 * carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 */

		int arr[] = { 2, 4, 5, 7, 8, 1, 23 };
		int carpim = 1;
		for (int each : arr)

		{
			carpim *= each;

		}
		System.out.println("carpimi :" + carpim);

		System.out.println();
		//her adimda carpimi görmek istersek;
		carpim=1;
		int count=1;	
				
		for (int each : arr)

		{
			carpim *= each;

			System.out.println(count+" adim carpimi :" + carpim);
		}
	}

}
