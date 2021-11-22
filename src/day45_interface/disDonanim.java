package day45_interface;

public interface disDonanim {

	public void ayna();
	
	public void kapi();
	
	public void kaporta();
	
	String RENK= "kirmizi";
	
	public default  String sisLamp() { //bu method normal body li oldugu icin concrete bir method dur.
		return "sisliHAvaya dikkat";
		
	}
	public static  String boya() { //bu method normal body li oldugu icin concrete bir method dur.
		return "boyaya dikkat";// ya static ya da default olmalidir ama...
	}
}
