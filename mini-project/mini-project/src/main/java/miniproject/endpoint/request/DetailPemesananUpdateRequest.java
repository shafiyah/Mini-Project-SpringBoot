package miniproject.endpoint.request;

import java.io.Serializable;

public class DetailPemesananUpdateRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idPemesanan;
	private int idBarang;
	private int jumlahBarang;
	
	
	public DetailPemesananUpdateRequest() {}


	public DetailPemesananUpdateRequest(int idPemesanan, int idBarang, int jumlahBarang) {
		super();
		this.idPemesanan = idPemesanan;
		this.idBarang = idBarang;
		this.jumlahBarang = jumlahBarang;
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


	public int getJumlahBarang() {
		return jumlahBarang;
	}


	public void setJumlahBarang(int jumlahBarang) {
		this.jumlahBarang = jumlahBarang;
	}
	
	
}
