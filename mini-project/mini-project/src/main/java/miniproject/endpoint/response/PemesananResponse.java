package miniproject.endpoint.response;

import java.io.Serializable;
import java.util.List;

public class PemesananResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPemesanan;
	private String namaPemesan;
	private String tanggalPemesanan;
	private String keteranganPesanan;
	private List<DetailPemesananResponse> listDetailPemesananResponse;
	
	public PemesananResponse() {}

	public PemesananResponse(String namaPemesan, int idPemesanan, String tanggalPemesanan, String keteranganPesanan,
			List<DetailPemesananResponse> listDetailPemesananResponse) {
		super();
		this.namaPemesan = namaPemesan;
		this.idPemesanan = idPemesanan;
		this.tanggalPemesanan = tanggalPemesanan;
		this.keteranganPesanan = keteranganPesanan;
		this.listDetailPemesananResponse = listDetailPemesananResponse;
	}



	public String getnamaPemesan() {
		return namaPemesan;
	}

	public void setIdPemesan(String namaPemesan) {
		this.namaPemesan = namaPemesan;
	}

	public int getIdPemesanan() {
		return idPemesanan;
	}

	public void setIdPemesanan(int idPemesanan) {
		this.idPemesanan = idPemesanan;
	}

	public String getTanggalPemesanan() {
		return tanggalPemesanan;
	}

	public void setTanggalPemesanan(String tanggalPemesanan) {
		this.tanggalPemesanan = tanggalPemesanan;
	}

	public String getKeteranganPesanan() {
		return keteranganPesanan;
	}

	public void setKeteranganPesanan(String keteranganPesanan) {
		this.keteranganPesanan = keteranganPesanan;
	}

	public List<DetailPemesananResponse> getListDetailPemesananResponse() {
		return listDetailPemesananResponse;
	}

	public void setListDetailPemesananResponse(List<DetailPemesananResponse> listDetailPemesananResponse) {
		this.listDetailPemesananResponse = listDetailPemesananResponse;
	}
    
	
	
}
