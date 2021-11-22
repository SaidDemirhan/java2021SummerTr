package day39_overriding;

public class Animal {

	public void beslenme() {
		System.out.println("Tüm hayvanlar beslenir");

	}

	
	protected void tatli() {//private haricindekiler oluyor
		//default protected public olur
		//child i bu ac mo daraltamaz. genisletebilir.
		
		System.out.println("tralice");
	}
	
	protected String icecek() {
		System.out.println("nigde gazozu");
		return "ohh";
	}
	
	public Integer topla() {
		return 34+6;
	}
	
	public Animal fatih() {
		return new Animal();
	}
}
