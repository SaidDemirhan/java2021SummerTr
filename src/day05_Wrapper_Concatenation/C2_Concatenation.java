package day05_Wrapper_Concatenation;

public class C2_Concatenation {

	public static void main(String[] args) {

String str1="Hallo";
String str2="World";
int sayi1= 3;
int sayi2=4;

// hallo1 yazdirmak icin
System.out.println(str1+ (sayi2-sayi2));

// hallo 5 world
System.out.println(str1+ " "+ (sayi2 + ++sayi2- sayi1)+" "+ str2 );

//hallo 34

System.out.println(str1+ " "+ sayi1+ --sayi2);

//7World

System.out.println(sayi1+ sayi2+ str2);

// 34

System.out.println(sayi1+ sayi2); //7 yapar
System.out.println(sayi1+""+ sayi2);

//int Stringe cevirmek icin method a ihtiyac var. yukardak 34 un data turu Stringdir. cunku bosluk u da topladik.
// ama 7 int data t�r�ndedir,

String intdanCevrilen="sayi2+ sayi1";
String intdanCevrilen2=""+ sayi2;




	}

}
