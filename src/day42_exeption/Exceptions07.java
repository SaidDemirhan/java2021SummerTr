package day42_exeption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions07 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };

		System.out.println(arr[1]);// 2

		System.out.println(arr[3]);// 4

		// System.out.println(arr[5]);// java.lang.ArrayIndexOutOfBoundsException
		// calistirildiktan sonra array da bu kadar index olmadigini görür.

		List<String> gzlInsn = new ArrayList<>(Arrays.asList("Merve", "Hakan", "Firat"));

		System.out.println(gzlInsn.get(2));// merve

		System.out.println(gzlInsn.get(0));// firat

		System.out.println(gzlInsn.get(5));// java.lang.IndexOutOfBoundsException
		// olmayan index ile islem yapilirsa bu unchecked hatasi verir.
	}

}
