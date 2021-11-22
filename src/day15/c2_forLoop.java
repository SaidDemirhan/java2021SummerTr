package day15;

import java.util.Iterator;

public class c2_forLoop {

	public static void main(String[] args) {
		// 10 dan 20 ye kadar olan sayilari yazdiran bir loop olusturun.
		
		
	
		for (int i=10;i<=20;i++) {
			System.out.print(i+" ");
		}
			System.out.println("");
			
			//100 ile 200 dahil aralarindaki 10 ile bolunebilen sayilari yazdirin.
			
		for (int i1 = 100; i1<=200; i1+=10) {
			System.out.print(i1+ " ");
		}
		
		//50 den 10a kadar sinirlar dahil 3 er 3 er geri sayarak yazdir
		for (int j = 50; j <=10; j-=3) {
			System.out.print(j+ " ");
		}
			//50 ile 100 arasindaki 3 ile bölünebilen sayilari yazdir
			System.out.println(" ");
		for (int j =50; j<=100; j++ ) {		
			if (j%3==0) {  		//3 ile tam bölunuyorsa
				System.out.print(j+" ");
			}
		}
		/*   eger degisken verilen artis veya azalisla bitis kosuluna ulasamiyorsa sonsuz loop olusur,
		for (int i = 10; i <20; i--) {
			System.out.print(i+" ");
		}	
		*/
		
		for (int i = 10; i <0; i++) {		// deger kosulu saglamiyorsa ölü bir loop olur. calismazzz..    10 sayisi 0 dan kucuk degil..
			System.out.print(i+" ");
		}
		
		System.out.println("son forloop un sonrasi");
		
	}

}
