package day01variables;
import java.util.Scanner;
public class C02_Scanner01 {
	public static void main(String[] args) {
		//kullanicidan bilgi almak icin 3 adima ihtiyacimiz var
		//1- Scanner class indan bir obje olusturuyoruz
		Scanner scan = new Scanner(System.in);
		//2- kullaniciya ne istediginizi bildiren bir mesaj yazin.
		System.out.println("Lütfen isminizi giriniz");
		// Kullanicidan istedigimiz bilginin data türüne göre
		// bir varaable olusturup 
		//konsolda yazilan bilgiyi kodlarimiz icine aliyoruz.
		String kullanicininIsmi = scan.nextLine();
		System.out.println("girdiginiz isim: " + kullanicininIsmi);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("lütfen yasinizi giriniz");
		String kullaniciYasi = scan.nextLine();
		System.out.println("girilen yas: " + kullaniciYasi);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Memleketini yazar misin?");
		String nereli = scan.nextLine();
		System.out.println(nereli +" sehrini cok sevdigini biliyorum.");
	}
}
