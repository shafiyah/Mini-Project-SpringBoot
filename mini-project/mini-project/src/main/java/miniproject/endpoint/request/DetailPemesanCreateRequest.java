package miniproject.endpoint.request;

import java.io.Serializable;

public class DetailPemesanCreateRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	private int idBarang;
	private int jumlahBarang;
	public DetailPemesanCreateRequest() {}
	
	public DetailPemesanCreateRequest( int idBarang, int jumlahBarang) {
		super();

		this.idBarang = idBarang;
		this.jumlahBarang = jumlahBarang;
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
