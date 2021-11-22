package day39_overriding;

public class Dog extends Animal {

	//Overriding; parent class taki bir kodu child class ta özellestirerek kullanmaktir
	
	/*
	 * OVERRIDING KURALLAR
	 * 1- ISIM PARAMETRE ASLA DEGISTIRILEMEZ:
	 * 2- ACSESS MODIFIER BELIRLI KURALLARA GORE DEGISTIRLEBILIR:
	 * 3- RETURN TYPE  BELIRLI KURALLARA GÖRE DEGISTIRILEBILIR:
	 * 4- METHOD BODY %99 DEGISTIRILIR: DEGISTIRILMEZSE GEREKSIZ KOD YAZIMI OLUR ALTINI SARI CIZER
	 * 5- RELATIONSCHIP (PARENT-CHILD) SARTTIR: INHERITANCE OLMADAN OVERRIDDING OLAMAZ:
	 * 6- PARENT CLASS TAKI METHOD OVERRIDING YAPILAN YANI UZERIN YAZILAN METHODDUR. 
	 * 	OVERRIDING EZILEN	OVERRIDDEN EZEN MANASINA GELIYOR:
	 * 
	 * 7-  METHOC AC MODIFIER CHILD TARFINDAN GENISLETILEBILIRIR AMA ASLA DARALTILAMAZ.
	 * 	SubAccMod >= SuperAccMod
	 * 
	 * 8- return typlar ayni olmali
	 * 
	 * 9- child deki return type i wrapper clastan ise parentinki
	 * de wrapper clss tan olmali
	 * 
	 * 10child in return typi ile parent in return typi arasinda is a iliskisi olmali
	 * 
	 * 11 static methodlar overriding edilimez
	 * 
	 * 12 private methodlar overriding edilemezler (cunku private)
	 * 
	 * 13 final method lar overriding edilemezler. (cunku son hali)
	 * 
	 * 14 polymorphism overriding ve overloading den olusan yaoidir.
	 * 
	 * overloading   public void yemek (){...}
	 * 				 public void yemek (String tatli){...}
	 * 				 public void yemek (String tatli,int ucret){...}
	 * 
	 * overriding  	 public void icecek(){syso(gazoz)}
	 * 				 public void icecek(){syso(dark bir kahve)}
	 * 				 public void icecek(){syso(ucret)}
	 * 
	 * overloading ile overriding arasindaki farklar
	 * 
	 * 1 signature (name+parametre) degistirilir	
	 * 								/degistirilmez asla dokunulamaz.
	 * 
	 *  
	 *  2 inheritance gerekmez
	 *  							/inheritance olmadan olmaz
	 *  
	 *  3 bady degistirilmeden kullanilir
	 *  							/%99 degismez
	 *  
	 *  4 Stattic ve private methodlar overriding edilemzler
	 *  							/edilebilirler
	 * 
	 * 5 cte verir ve static tir
	 * 								rte verir ve dinamiktir.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Override //*** javanin bir Annotation udur
	//-mutlaka child class a yazilir
	//-parent ve child classlari arasinda iliski kurar.
	//-yazmazsak bir override iliskisi olmaz.
	// zabita gibi calisir.
	
	public void beslenme() {
		System.out.println("köppekler kemik ile beslenir.");
	}

	@Override
	public void tatli() {
		System.out.println("fistik sarma");
	}

	@Override
	protected String icecek() {
		System.out.println("tursu suyu");	
		return "yasasin";
	}

	@Override
	public Integer topla() {
		
		return 41+54;
	}

	@Override
	public Dog fatih() {

		return new Dog(); //aralarindaki  
		//inheritance den dolayi bu istisna olabiliyor
	}
	
}
