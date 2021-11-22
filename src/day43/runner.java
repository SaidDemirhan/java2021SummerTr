package day43;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {

		Scanner scan=new Scanner(System.in);
		System.out.println("emailinizi giriniz: ");
		String email=scan.nextLine();
				
		if (email.contains("@gmail.com")||email.contains("@hotmail.com")) {
			System.out.println("basarili");
		}else {
			throw new day43.InvalidEmailIdCheckedException("bu neyin kafasi");
		}
		mailDogrula();

	}

	private static void mailDogrula() {
		// TODO Auto-generated method stub
		
	}

}
