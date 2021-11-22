package day42_exeption;

public class Exceptions06 {

	public static void main(String[] args) {
		String str1 = " ";//space
		String str2 = "";//hiclik
		String str3 = null;//hicbir deger esit olmadigini gösterir
		
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
		//System.out.println(str3.length());// java.lang.NullPointerException
		
		
		System.out.println(str3+"bahar");//nullbahar
		
		//System.out.println(str3.concat("bahar"));// java.lang.NullPointerException rte
		//concat olursa null bir pointerdir bir method olusturamazsiniz.
		
		
		
		
		
		
		
		
	}

}
