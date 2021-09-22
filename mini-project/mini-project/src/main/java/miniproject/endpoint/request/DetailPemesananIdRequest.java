package miniproject.endpoint.request;

import java.io.Serializable;

public class DetailPemesananIdRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idDetailPemesanan;
	public DetailPemesananIdRequest(int idDetailPemesanan) {
		super();
		this.idDetailPemesanan = idDetailPemesanan;
	}
	public int getIdDetailPemesanan() {
		return idDetailPemesanan;
	}
	public void setIdDetailPemesanan(int idDetailPemesanan) {
		this.idDetailPemesanan = idDetailPemesanan;
	}
	

}
