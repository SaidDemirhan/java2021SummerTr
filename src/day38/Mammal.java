package day38;

public class Mammal extends Animal {

	public int c = 7;
	public int m = 4; // parenti ile ayni

	public void mA() { // parenti ile ayni
		System.out.println("mammal");
	}

	public void mC() {
		System.out.println("cat " + "mammal");
	}

	public Mammal() {
		this('a');
		System.out.println("psiz mamal cons");
	}

	public Mammal(char c) {
		super(34); //parent ten pli const call
		
		System.out.println("pli const mamal");
	}

}
