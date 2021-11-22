package day38;

public class Cat extends Mammal {

	public int c = 9;
	public int d = 5;
	public void Md() {
		System.out.println("Nankör kedi");
	}
	public void mC() {
		System.out.println("cat");
	}

	Cat() {
		System.out.println("psiz cons cat");
	}
	
	Cat(String s) {
		this();
		System.out.println("parent deki c geliyor:"+super.c);
		System.out.println("pli const cat");
	}
}
