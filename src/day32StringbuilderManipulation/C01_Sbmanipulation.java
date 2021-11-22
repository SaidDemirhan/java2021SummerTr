package day32StringbuilderManipulation;

import java.util.Arrays;

public class C01_Sbmanipulation {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();

		sb1.append("Javacilar zengin mi?");
		System.out.println(sb1.capacity()); // 34
		sb1.trimToSize();
		System.out.println(sb1.capacity()); // 20

		sb1.append(" acaba");

		System.out.println(sb1); // Javacilar zengin mi? acaba
		System.out.println(sb1.capacity()); // 42

		System.out.println(sb1.indexOf("a")); // 1 bastaki a nin indexini aldi

		System.out.println(sb1.lastIndexOf("a")); // 25 sondaki a nin indexi

		System.out.println(sb1.charAt(7)); // a 7. karakteri verdi

		System.out.println(sb1.substring(7, 12)); // ar ze seklinde arasini getirdi

		System.out.println(sb1.substring(17)); // mi? acaba seklinde sonrasini getirdi

		System.out.println(sb1.subSequence(7, sb1.length() - 3)); // ar zengin mi? ac

		System.out.println(sb1.delete(7, 12)); // Javacilngin mi? acaba oldu yani 7 12 arasini sildi

		System.out.println(sb1.deleteCharAt(7)); // Javacilgin mi? acaba sadece n yi sildi

		System.out.println(sb1.insert(7, "ar zen")); // Javacilar zengin mi? acaba

		// ille char yazmak zorunda degiliz. value de alabilir.

		System.out.println(sb1.insert(0, 312)); // 312Javacilar zengin mi? acaba
		
		// hatta arr bile yazilabilir

		int arr[] = { 3, 5, 7, 9 };

		System.out.println(sb1.insert(sb1.length(), Arrays.toString(arr))); 
							// 312Javacilar zengin mi? acaba[3, 5, 7, 9]

		System.out.println(sb1.replace(3, 12, "Pytoncilar da ")); //yerine silip yazdi
							//312Pytoncilar da zengin mi? acaba[3, 5, 7, 9]
		
		System.out.println(sb1.replace(0, 3, "x")); //3 luk yere 1 yazarsak diger indexleri silmis olur.
			 				//xPytoncilar da  zengin mi? acaba[3, 5, 7, 9]

		System.out.println(sb1.insert(1, "Merhaba", 3, 5)); //ha yazdirdi sadece
							//xhaPytoncilar da  zengin mi? acaba[3, 5, 7, 9]
		
		System.out.println(sb1.reverse()); 

		
		
	}

}
