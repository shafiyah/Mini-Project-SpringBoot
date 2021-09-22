package miniproject.endpoint.request;

import java.io.Serializable;

public class PemesananIdRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idPemesanan;
	
	
	public PemesananIdRequest() {
	}
	public PemesananIdRequest(int idPemesanan) {
		super();
		this.idPemesanan = idPemesanan;
	}
	public int getIdPemesanan() {
		return idPemesanan;
	}
	public void setIdPemesanan(int idPemesanan) {
		this.idPemesanan = idPemesanan;
	}
	
}
