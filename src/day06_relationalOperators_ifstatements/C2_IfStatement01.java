package day06_relationalOperators_ifstatements;

public class C2_IfStatement01 {

	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		
		if (a>b)
		{
			System.out.println("ab`den b�y�k");
		}
		if (a==b) {
			System.out.println("sayilar esit");
		}
		
		if(a>b||a+b<=10) {
			System.out.println("yasasin java"); //sartin sonucu true ise if body calisir
												// calissa da calismasa da body den sonraki satira gider
		}
		
		if (a+b<0||a*b>20) {
			System.out.println("bitti bu is");	
		}
		
	}

}
