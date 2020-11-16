package kelompok4.sesi10;


public class Pesanan extends Makanan {

	int total_beli, harga_total, kembalian;

	public int getTotal_beli() {
		total_beli=harga*kode_makanan;
		return total_beli;
	}

	public void setTotal_beli(int total_beli) {
		this.total_beli = total_beli;
	}

	public int getHarga_total() {
		harga_total = kode_makanan * jumlah;
		return harga_total;
	}

	public void setHarga_total(int harga_total) {
		this.harga_total = harga_total;
	}

	public int getKembalian() {
		kembalian = uang - harga_total;
		return kembalian;
	}

	public void setKembalian(int kembalian) {
		this.kembalian = kembalian;
	}
	
}