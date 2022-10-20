/*Algoritma
1.Meminta masukkan bilangan bulat(N)
2.Menentukan hari sesuai dengan bilangan bulat yang diinput

*/

import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int bilanganBulat = s.nextInt();

		switch (bilanganBulat) {
		case 1:
			System.out.println("Senin");
			break;
		case 2:
			System.out.println("Selasa");
			break;
		case 3:
			System.out.println("Rabu");
			break;
		case 4:
			System.out.println("Kamis");
			break;
		case 5:
			System.out.println("Jummat");
			break;
		case 6:
			System.out.println("Sabtu");
			break;
		case 7:
			System.out.println("Minggu");
			break;
		default:
			break;
		}
	}
}
