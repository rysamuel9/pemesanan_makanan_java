package kelompok4.sesi10;

public class KasirLibrary extends Makanan {
	
	public static void main(String[] args) {
		
		hitung_total_beli();
		hitung_kembalian();
		tampil_menu_makanan();
		
	}

	

	private static void hitung_total_beli() {
		System.out.println("===============De Raospisan===============");
		System.out.println(p.harga_total);
	}
	
	private static void hitung_kembalian() {
		System.out.println(p.kembalian);
	}
	
	private static void tampil_menu_makanan() {
		System.out.println(nama_makanan);
		System.out.println("===============Terima Kasih===============");
	}
}
