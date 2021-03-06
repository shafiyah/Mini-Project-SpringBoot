package miniproject.repository.dto;

import java.io.Serializable;


public class DetailPemesananDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idDetailpemesanan;
	private int idPemesanan;
	private int idBarang;
	private int jumlah_barang;
	
	public DetailPemesananDto() {
	}

	public DetailPemesananDto(int idDetailpemesanan, int idPemesanan, int idBarang, int jumlah_barang) {
		super();
		this.idDetailpemesanan = idDetailpemesanan;
		this.idPemesanan = idPemesanan;
		this.idBarang = idBarang;
		this.jumlah_barang = jumlah_barang;
	}

	public int getIdDetailpemesanan() {
		return idDetailpemesanan;
	}

	public void setIdDetailpemesanan(int idDetailpemesanan) {
		this.idDetailpemesanan = idDetailpemesanan;
	}

	public int getIdPemesanan() {
		return idPemesanan;
	}

	public void setIdPemesanan(int idPemesanan) {
		this.idPemesanan = idPemesanan;
	}

	public int getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(int idBarang) {
		this.idBarang = idBarang;
	}

	public int getJumlah_barang() {
		return jumlah_barang;
	}

	public void setJumlah_barang(int jumlah_barang) {
		this.jumlah_barang = jumlah_barang;
	}
}
