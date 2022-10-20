/*Algoritma
1.Meminta masukkan nama hari(H)
2.Meminta masukkan bilangan bulat(N)
3.Menampilkan nama hari yang jatuh setelah (N)
*/
import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);

		String hari = s.nextLine();
		int bilbul = s.nextInt();
		int modulus = bilbul % 7;

		switch (hari){
			case "Senin":
				switch (modulus) {
					case 0:
					System.out.println("Senin");
						break;
					case 1:
					System.out.println("Selasa");	
						break;
					case 2:
					System.out.println("Rabu");
						break;
					case 3:
					System.out.println("Kamis");
						break;
					case 4:
					System.out.println("Jumat");
						break;
					case 5:
					System.out.println("Sabtu");
						break;
					case 6:
					System.out.println("Minggu");
						break;
					default:
						break;
				}
				break;
		    case "Selasa":
			switch (modulus) {
				case 0:
				System.out.println("Selasa");
					break;
				case 1:
				System.out.println("Rabu");	
					break;
				case 2:
				System.out.println("Kamis");
					break;
				case 3:
				System.out.println("Jumat");
					break;
				case 4:
				System.out.println("Sabtu");
					break;
				case 5:
				System.out.println("Minggu");
					break;
				case 6:
				System.out.println("Senin");
					break;
				default:
					break;
			}
			break;
			case "Rabu":
			switch (modulus) {
				case 0:
				System.out.println("Rabu");
					break;
				case 1:
				System.out.println("Kamis");	
					break;
				case 2:
				System.out.println("Jumat");
					break;
				case 3:
				System.out.println("Sabtu");
					break;
				case 4:
				System.out.println("Minggu");
					break;
				case 5:
				System.out.println("Senin");
					break;
				case 6:
				System.out.println("Selasa");
					break;
				default:
					break;
			}
			break;
			case "Kamis":
			switch (modulus) {
				case 0:
				System.out.println("Kamis");
					break;
				case 1:
				System.out.println("Jumat");	
					break;
				case 2:
				System.out.println("Sabtu");
					break;
				case 3:
				System.out.println("Minggu");
					break;
				case 4:
				System.out.println("Senin");
					break;
				case 5:
				System.out.println("Selasa");
					break;
				case 6:
				System.out.println("Rabu");
					break;
				default:
					break;
			}
			break;
			case "Jumat":
			switch (modulus) {
				case 0:
				System.out.println("Jumat");
					break;
				case 1:
				System.out.println("Sabtu");	
					break;
				case 2:
				System.out.println("Minggu");
					break;
				case 3:
				System.out.println("Senin");
					break;
				case 4:
				System.out.println("Selasa");
					break;
				case 5:
				System.out.println("Rabu");
					break;
				case 6:
				System.out.println("Kamis");
					break;
				default:
					break;
			}
			break;
			case "Sabtu" :
			switch (modulus) {
				case 0:
				System.out.println("Sabtu");
					break;
				case 1:
				System.out.println("Minggu");	
					break;
				case 2:
				System.out.println("Senin");
					break;
				case 3:
				System.out.println("Selasa");
					break;
				case 4:
				System.out.println("Rabu");
					break;
				case 5:
				System.out.println("Kamis");
					break;
				case 6:
				System.out.println("Jumat");
					break;
				default:
					break;
			}
			break;
			case "Minggu":
			switch (modulus) {
				case 0:
				System.out.println("Minggu");
					break;
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
				System.out.println("Jumat");
					break;
				case 6:
				System.out.println("Sabtu");
					break;
				default:
					break;
			}
			default:
				break;
		}
	}
}
