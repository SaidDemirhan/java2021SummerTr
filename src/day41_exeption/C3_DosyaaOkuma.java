package day41_exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C3_DosyaaOkuma {

	public static void main(String[] args) {
		try {// parent try catch file yerini kontrol ediyor
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\ASD\\eclipse-workspace\\java2021SummerTr\\src\\day41_exeption\\file");
			int i = 0;

			try {// file icerigini okuma ve yazdirma icerigini handle etti
				while ((i = fis.read()) != -1) {// -1 e esit degilse loop a gir

					System.out.print((char) (i));

				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		catch (FileNotFoundException e) {

			// e.printStackTrace();

			System.out.println(e.getMessage());
		}

		System.out.println("\naradigin dosya okunmustur.");
	}

}
