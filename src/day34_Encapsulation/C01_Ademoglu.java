package day34_Encapsulation;

public class C01_Ademoglu {

	String name;
	String surname;
	private int age;
	
	//fields atribut properties diyoruz bunlara
	
	public void yasAta(int age) {
		if (age<0) {
			this.age=-age;// eksi bir deger girse de - ile carp
		}else this.age=age;
		
	
		
	}
	
	public int yasGoster() {
		return this.age;
	}
}
