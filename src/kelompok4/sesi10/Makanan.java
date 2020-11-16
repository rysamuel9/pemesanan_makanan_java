package kelompok4.sesi10;

import java.util.Scanner;

public class Makanan {
	static String data;
	static int kode_makanan, nama_makanan, harga, jumlah, uang;
	static Scanner sam = new Scanner (System.in);
	static Pesanan p=new Pesanan();
	public static void main(String[] args) {
		
		System.out.println("====================De Raospisan====================");
		System.out.println("1. Nasi putih      Rp. 10.000");
		System.out.println("2. Nasi Goreng     RP. 20.000");
		System.out.println("3. Ayam bakar      Rp. 15.000");
		System.out.println("4. Ayam goreng     Rp. 15.000");
		System.out.println("5. Baso tahu       Rp. 20.000");
		System.out.println("6. Seblak          Rp. 21.000");
		System.out.println("7. Jus apel        Rp. 25.000");
		System.out.println("====================De Raospisan====================");

		System.out.print("Masukan pesanan anda = ");
		kode_makanan = sam.nextInt();
		if (kode_makanan == 1){
			harga = 10000;
		}
		else if (kode_makanan == 2){
			harga = 20000;
		}
		else if (kode_makanan == 3){
			harga = 15000;
		}
		else if (kode_makanan == 4){
			harga = 15000;
		}
		else if (kode_makanan == 5){
			harga = 20000;
		}
		else if (kode_makanan == 6){
			harga = 21000;
		}
		else if (kode_makanan == 7){
			harga = 25000;
		}
		System.out.print("Jumlah pesanan = ");
		jumlah = sam.nextInt();
		
		System.out.print("Mau pesan lagi [Y/N] = ");
		
		System.out.print("Masukan Uang Pembayaran = ");
		uang = sam.nextInt();
		if(data.equalsIgnoreCase("Y")){
			
		}
		else if(data.equalsIgnoreCase("N")){
			System.out.println("====================De Raospisan====================");
			System.out.println("Sub  Total = "+p.getTotal_beli());
			System.out.println("Cash = "+uang);
			System.out.println("Kembalian = "+p.getKembalian());
		}
		
		
	
	}

}
