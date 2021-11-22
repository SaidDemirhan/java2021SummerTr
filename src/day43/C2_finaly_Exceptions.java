package day43;

public class C2_finaly_Exceptions {

	public static void main(String[] args) {
		int [] arr = {34,35,41,63,21};
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("hatali index girdiniz!");
		}

		finally {
			System.out.println("dewamke, kod okunmustur");
		}
	}
/*
 * 	Index 5 out of bounds for length 5
*	hatali index girdiniz!
*	dewamke, kod okunmustur
 */
	
	
	/*
	 * finaly blogu try catch blogu ile veya sadece try blogu ile calisabilir.
	 *Finally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
		ongoremedigim bir exception olustugunda da calisir
	 * finaly blok her zaman calisir
	 * 
	 * 
	 * 
	 */
}
