package day44_AbstractClass;

public abstract class Volvo {// abs cls

	
	public abstract void kapi(); //abs mthd
		
	public abstract void motor();
	
		public void sunroof() {
			System.out.println("sanruflu");
		}
		
		//Abstract bir class ta hem abstract hem de concrete bir method olabilir
	
		int fiyat=10000;//tavsiye olarak bu fiyati abst claslar alabilirler
		//int fiyat2; // bu sekilde de olusturulabilir.
		
		
		/* abstact classta obje olusturulamaz
		Volvo volvo=new Volvo() {

			@Override
			public void kapi() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void motor() {
				// TODO Auto-generated method stub
				
			}
			
		};*/
		
		
	}

