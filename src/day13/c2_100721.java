package day13;

public class c2_100721 {

	public static void main(String[] args) {

		/*
		 * bir metodu olusturmak o meteodu calistirmak icin ytereli degildir.
		 * eger bir methodu calistirmak isterseniz Method Call (o method u cagirmalisiniz.)
		 * 
		 * Method Call yapmak icin  methodun adi ve parametreleri yazilmalidir.
		 * 
		 */
		
		toplama(20,40);
		
		//sadece Method Call yazdigimizda method calisir.
		//eger methodun icinde  bir sey yazdiriyorsak o yaziyi görürüz.
		
		//ancak methodumuz return type a sahipse bize bir sonuc return edecektir.
		//bu sonucu ya direkt yazdiririz
		
		System.out.println(toplama(15,20));
		
		//
		
		int sonuc=toplama (10,15);
		
		//System.out.println(sonuc);
		
		

	}
	
	public static int toplama(int sayi1,int sayi2) {
		
		System.out.println("Method calisti");
		return sayi1+sayi2;
	}
	

}
