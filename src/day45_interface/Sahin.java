package day45_interface;

public class Sahin extends Tofas implements icDonanim, lastik{

	@Override
	public void kapi() {
		System.out.println("5 kapi");
		
	}

	@Override
	public void kaporta() {
		System.out.println("paslanmaz celik kaporta");
		
	}

	@Override
	public void koltuk() {
		System.out.println("isitmali koltuk");
		
	}

	@Override
	public void ayna() {// dis donanimi sildim ama extends den dolayi geldi
		System.out.println("parlak ayna");
		
	}

	@Override
	public void motor() {
		System.out.println("gazli");
		
	}

	@Override
	public void yakit() {
		System.out.println("gaz");
		
	}

	@Override
	public void ebat() {
		System.out.println("16 inc teker");
		
	}

	@Override
	public void jant() {
		System.out.println("celik jant");
		
	}
	

	
}
