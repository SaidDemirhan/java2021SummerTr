package day44_AbstractClass;

public abstract class Kaporta extends Volvo {

	@Override
	public void kapi() {
		System.out.println("volvonun kapisi saglamdir");
		
	}

	//***public veya protected harici kabul edilmez
	//final abstract void kapikolu();
	//private abstract void mentese();
	//private abstract void kapiCami();
	
}
