package day11;

public class c4_080721 {

	public static void main(String[] args) {
		String kkNo="1554 1525 2598 2365";
				System.out.println(kkNo.replace( " ", "" ));
				
				System.out.println(kkNo.replaceAll( "\\s", "*"));
				
				System.out.println(kkNo.replaceAll( "\\S", "*"));
		
				System.out.println(kkNo.replaceAll("\\w", "#" ));
				
				System.out.println(kkNo.replaceAll("\\W", "#" ));
				
				String kkNo2="Java 123 @#";		
					System.out.println(kkNo2.replaceAll("\\d", "0"));
					System.out.println(kkNo2.replaceAll("\\D", "a"));
	}

}
