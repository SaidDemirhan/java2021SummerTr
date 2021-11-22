package day05_Wrapper_Concatenation;

public class C3_Concatenation02 {

	public static void main(String[] args) {
		int sayi=7;
		char ilkharf='a' ;//a nin asci degeri 97 imis
		String str="Java"	;	
				System.out.println(sayi+str+ilkharf);	//7Javaa
				System.out.println(sayi+ilkharf+str);	//104Java	97+7+Java
				
//7a yazdirmak icin
				
	System.out.println(sayi+ ""+ilkharf);			
	}

}
