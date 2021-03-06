package miniproject.endpoint.request;

import java.io.Serializable;

public class PemesananBarangUpdateRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idPememsanan;
	private int idBarang;
	private int jumlahBarang;
	
	
	public PemesananBarangUpdateRequest() {}
	
	public PemesananBarangUpdateRequest(int idPememsanan, int idBarang, int jumlahBarang) {
		super();
		this.idPememsanan = idPememsanan;
		this.idBarang = idBarang;
		this.jumlahBarang = jumlahBarang;
	}
	public int getIdPememsanan() {
		return idPememsanan;
	}
	public void setIdPememsanan(int idPememsanan) {
		this.idPememsanan = idPememsanan;
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
