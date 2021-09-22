package miniproject.endpoint.request;

import java.io.Serializable;
import java.util.List;

public class PemesananCreateRequest implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String tanggalPemesanan;
	private String keterangan;
	private int idPemesan;
	private List<DetailPemesananCreateRequest> barangPemesanan;
	
	
	public PemesananCreateRequest() {}
	public PemesananCreateRequest(String tanggalPemesanan, String keterangan, int idPemesan,
			List<DetailPemesananCreateRequest> barangPemesanan) {
		super();
		this.tanggalPemesanan = tanggalPemesanan;
		this.keterangan = keterangan;
		this.idPemesan = idPemesan;
		this.barangPemesanan = barangPemesanan;
	}
	public String getTanggalPemesanan() {
		return tanggalPemesanan;
	}
	public void setTanggalPemesanan(String tanggalPemesanan) {
		this.tanggalPemesanan = tanggalPemesanan;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	public int getIdPemesan() {
		return idPemesan;
	}
	public void setIdPemesan(int idPemesan) {
		this.idPemesan = idPemesan;
	}
	public List<DetailPemesananCreateRequest> getBarangPemesanan() {
		return barangPemesanan;
	}
	public void setBarangPemesanan(List<DetailPemesananCreateRequest> barangPemesanan) {
		this.barangPemesanan = barangPemesanan;
	}
}
