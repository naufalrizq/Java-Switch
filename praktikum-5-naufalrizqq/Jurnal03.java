/*Algoritma
1.Meminta masukkan bilangan ke 1(A)
2.Meminta masukkan tanda operasi(O)
3.Meminta masukkan bilangan ke2(B)
4.Melakukan operasi sesuai dengan a dan b. Tergantung dari tanda operasi yang dipilih
*/
import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		float bilbul1, bilbul2, hasil;
		String operator;

		
		bilbul1 = s.nextFloat();
		operator = s.next();
		bilbul2 = s.nextFloat();

		switch (operator) {
		case "+":
			hasil = bilbul1 + bilbul2;
			System.out.println(hasil);

			break;
		case "-":
			hasil = bilbul1 - bilbul2;
			System.out.println(hasil);
			break;
		case "*":
			hasil = bilbul1 * bilbul2;
			System.out.println(hasil);
			break;
		case "/":
			hasil = bilbul1 / bilbul2;
			System.out.println(hasil);

			break;

		default:
			break;

		}

	}
}
