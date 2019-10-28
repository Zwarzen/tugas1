import java.util.Scanner;

public class Contoh{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int angka;

		System.out.println("Masukkan angka : ");
		angka = input.nextInt();

		if (angka > 70){
			System.out.println("Selamat, Anda diterima");
		}

		else {
			System.out.println("Silahkan coba lagi tahun depan");
		}

	}
}