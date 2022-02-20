package counting;

import java.util.Scanner;

public class berhitung {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int variabel1 = input.nextInt();
		char operator = input.next().charAt(0);
		int variabel2 = input.nextInt();
		int hasil=0;
		
		if (operator=='+') {
			hasil = variabel1 + variabel2;
		}else if (operator=='-') {
			hasil = variabel1 - variabel2;
		}else if (operator=='*') {
			hasil = variabel1 * variabel2;
		}else if (operator=='/') {
			hasil = variabel1 / variabel2;
		}else if (operator=='%') {
			hasil = variabel1 % variabel2;
		}
		
		System.out.println(+ hasil);
		input.close();
	}

}
