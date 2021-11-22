package day40_overriding;

public class Arac {

	// renk, motor(private), model(protected) olsun

	private String renk;

	private int motor;

	protected String model;

	public Arac(String renk, int motor, String model) {
		super();
		this.renk = renk;
		this.motor = motor;
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	

}
