package miniproject.endpoint.request;

import java.io.Serializable;

public class BarangUpdateRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idBarang;
	private String namaBarang;
	private String deskripsiBarang;
	private int stock;
	
	
	public BarangUpdateRequest() {}

	public BarangUpdateRequest(int idBarang, String namaBarang, String deskripsiBarang, int stock) {
		super();
		this.idBarang = idBarang;
		this.namaBarang = namaBarang;
		this.deskripsiBarang = deskripsiBarang;
		this.stock = stock;
	}

	public int getIdBarang() {
		return idBarang;
	}

	public void setIdBarng(int idBarang) {
		this.idBarang = idBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public String getDeskripsiBarang() {
		return deskripsiBarang;
	}

	public void setDeskripsiBarang(String deskripsiBarang) {
		this.deskripsiBarang = deskripsiBarang;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
