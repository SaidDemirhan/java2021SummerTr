package day45_interface;

public interface icDonanim {

	public abstract void koltuk();// interface asla bir class degildir // method body si olamaz
	
	public void ayna(); //dis donanimda da oldugu halde burda ikinci kez yazmamiza ragmen hata vermedi

	String music="underground";
	// koyu(bold) ve italik ise = final
	
	//String kumas;// hata verir initialize talep eder.
	//final oldugu icin.

	public static String kumas="kadife";
	
	// public yazmiyorsa bile public dir interface
	//asla default degildir.
	String RENK= "ahsap";
}
