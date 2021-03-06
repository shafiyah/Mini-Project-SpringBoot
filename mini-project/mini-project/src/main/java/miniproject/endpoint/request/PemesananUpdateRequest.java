package miniproject.endpoint.request;

import java.io.Serializable;

public class PemesananUpdateRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idPemesanan;
	private int idPemesan;
	private String keterangan;
	private String tanggal;
	
	
	public PemesananUpdateRequest() {}
	
	public PemesananUpdateRequest(int idPemesanan, int idPemesan, String keterangan, String tanggal) {
		super();
		this.idPemesanan = idPemesanan;
		this.idPemesan = idPemesan;
		this.keterangan = keterangan;
		this.tanggal = tanggal;
	}
	public int getIdPemesanan() {
		return idPemesanan;
	}
	public void setIdPemesanan(int idPemesanan) {
		this.idPemesanan = idPemesanan;
	}
	public int getIdPemesan() {
		return idPemesan;
	}
	public void setIdPemesan(int idPemesan) {
		this.idPemesan = idPemesan;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	public String getTanggal() {
		return tanggal;
	}
	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}
	
}
