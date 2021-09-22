package miniproject.endpoint.response;

import java.io.Serializable;



public class BarangResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idBarang;
	private String namaBarang;
	private String deskripsiBarang;
	private int stokBarang;
	
	public BarangResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BarangResponse(int idBarang, String namaBarang, String deskripsiBarang, int stokBarang) {
		super();
		this.idBarang = idBarang;
		this.namaBarang = namaBarang;
		this.deskripsiBarang = deskripsiBarang;
		this.stokBarang = stokBarang;
	}
	public int getIdBarang() {
		return idBarang;
	}
	public void setIdBarang(int idBarang) {
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
	public int getStokBarang() {
		return stokBarang;
	}
	public void setStokBarang(int stokBarang) {
		this.stokBarang = stokBarang;
	}
	
}
