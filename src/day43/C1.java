package day43;

import java.io.FileInputStream;

import java.io.IOException;

public class C1 {
/*
 * throws keyword u sadece declaraion dur.
 * throws kullanilan method da exeption olursa Code Block olur
 * exetions arasinda parent child iliskisi varsa parent class exeptions throws dan sonra yazilmali
 * 
 */
	
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
                "/Users/yeni/eclipse-workspace/javaSummer2021Tr/src/_14_Exceptions/fil");
        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) (i));
        }

	}

}
