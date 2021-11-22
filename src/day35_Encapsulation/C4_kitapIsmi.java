package day35_Encapsulation;

import java.util.Scanner;

public class C4_kitapIsmi {
	/*
	 * TODO Book class'ı verilmiştir. İki tane attributes oluşturunuz. bookName ve
	 * authorName (String ile) Book class'ını kapsülleyin. (Encapsulate) Main
	 * class'ın içine object oluşturun ve sonucu yazdırınız.
	 * 
	 * todo "Book name is BOOKNAME and Author is AUTHORNAME"
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		C3 kitap = new C3();
		System.out.println("calikusu yazarini giriniz giriniz:");
		String yazar=scan.nextLine();
		kitap.setBookName("Calikusu");
		kitap.setAuthorName(yazar);
		System.out.println(kitap.getBookName()+" yazari: "+kitap.getAuthorName());
		scan.close();
	}

}
