package day22_23_arraylist;

import java.util.Arrays;
import java.util.List;

public class c8_list {

	public static void main(String[] args) {
		String arr[] = { "3", "5", "7" };			

		List<String> arrList = Arrays.asList(arr);

		System.out.println("List olarak: " + arrList);			//List olarak: [3, 5, 7]

		arr[1] = "Ali"; // arra in bir elemanini degistirdigiizde otomatik olarak list de degisiyor.

		System.out.println(arrList);     //[3, Ali, 7]
		
		arrList.set(0, "Ayse");
		
		System.out.println("List: "+ arrList);              //List: [Ayse, Ali, 7]
		
		System.out.println("array: "+Arrays.toString(arr)); //array: [Ayse, Ali, 7]
	}

}
