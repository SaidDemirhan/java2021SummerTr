package day34_Encapsulation;

public class C03 {
	String name;
	String surname;
	private int age1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getAge() {
		return age1;
	}


	public void setAge(int age1) {
		
		if (age1>0) {
			this.age1=age1;
		}else
		this.age1 = -age1;
	}


	

}
