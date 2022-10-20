/*Algoritma
1.Meminta masukkan bilangan bulat
2.Menjumlahkan hari ini(vandrendi)dengan bilangan bulat yang diinput. ex:input 2 output dimanche. Penjelasan : menambahkan 2 hari dari hari ini(vandrendi)

*/
import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
        int bilanganBulat = s.nextInt();
        int hari = 0;
        int modulus = bilanganBulat % 7;

        switch (bilanganBulat){
            case 1:
				System.out.println("samedi");
				break;
			case 2:
				System.out.println("dimanche");
				break;
			case 3:
				System.out.println("lundi");
				break;
			case 4:
				System.out.println("mardi");
				break;
			case 5:
				System.out.println("mercredi");
				break;
			case 6:
				System.out.println("jeudi");
				break;
			case 7:
				System.out.println("vandrendi");
				break;
        
            default:

            switch (modulus) {
                case 1:
				System.out.println("samedi");
				break;
			case 2:
				System.out.println("dimanche");
				break;
			case 3:
				System.out.println("lundi");
				break;
			case 4:
				System.out.println("mardi");
				break;
			case 5:
				System.out.println("mercredi");
				break;
			case 6:
				System.out.println("jeudi");
				break;
			case 0:
				System.out.println("vandrendi");
				break;
            
                default:
                    break;
            }

                break;
        }
    }
}