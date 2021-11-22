package day40_overriding;

public class Otobus extends Arac {

	int yolcuSayisi;

	public Otobus(String renk, int motor, String model, int yolcuSayisi) {
		super(renk, motor, model);
		this.yolcuSayisi = yolcuSayisi;
	}

	@Override
	public String toString() {
		return "Otobusun yolcu Sayisi=" + yolcuSayisi + ", model=" + model + ", Renk=" + getRenk() + ", Motor="
				+ getMotor() + ", Model=" + getModel() 
				 ;
	}

	

	
	
	

}
