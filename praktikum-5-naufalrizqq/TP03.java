/*Algoritma
1.Memasukkan nama bangun datar dan bilangan bulat yang akan digunakan sebagai sisi,panjang,lebar,alas,tinggi,diameter
3.Menghitung luas dan keliling bangun datar tersebut 
*/
import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String bangundatar = s.nextLine();
		int sisi,panjang,lebar,alas,tinggi,jari2,diameter;
		
		

		switch (bangundatar) {
			case "Persegi":
				sisi= s.nextInt();
				System.out.print(sisi*sisi);	//luas
				System.out.print(" ");
				System.out.print(sisi + sisi + sisi + sisi);	//keliling

				
				break;
			case "Persegi Panjang":
				panjang = s.nextInt();
				lebar = s.nextInt();
				System.out.print(panjang*lebar);	//luas
				System.out.print(" ");
				System.out.print(2*(panjang +lebar));	//keliling
				
				break;
			case "Segitiga":
				alas = s.nextInt();
				tinggi = s.nextInt();
				System.out.print((alas*tinggi)/2); //luas
				System.out.print(" ");
				System.out.print(alas * tinggi);	// keliling
				
				break;
			case "Lingkaran":
				diameter = s.nextInt();
				jari2 = diameter/2;
				System.out.print((3.14 * jari2 * jari2));
				System.out.print(" ");
				System.out.print((2*3.14*jari2));
			
				
				break;
		
			default:
				break;
		}
		
	}
}
