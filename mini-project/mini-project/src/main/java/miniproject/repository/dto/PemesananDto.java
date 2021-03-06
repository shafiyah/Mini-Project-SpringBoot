package miniproject.repository.dto;

import java.io.Serializable;
import java.util.List;



public class PemesananDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idPemesanan;
	private String keteranganPemesanan;
	private String tanggalPemesanan;
	private int pemesan;
	private List<DetailPemesananDto> detailPemesanan;
	
	public PemesananDto() {
	}

	public PemesananDto(int idPemesanan, String keteranganPemesanan, String tanggalPemesanan, int pemesan,
			List<DetailPemesananDto> detailPemesanan) {
		super();
		this.idPemesanan = idPemesanan;
		this.keteranganPemesanan = keteranganPemesanan;
		this.tanggalPemesanan = tanggalPemesanan;
		this.pemesan = pemesan;
		this.detailPemesanan = detailPemesanan;
	}
	public PemesananDto(int idPemesanan, String keteranganPemesanan, String tanggalPemesanan, int pemesan) {
		super();
		this.idPemesanan = idPemesanan;
		this.keteranganPemesanan = keteranganPemesanan;
		this.tanggalPemesanan = tanggalPemesanan;
		this.pemesan = pemesan;
	}


	public int getIdPemesanan() {
		return idPemesanan;
	}

	public void setIdPemesanan(int idPemesanan) {
		this.idPemesanan = idPemesanan;
	}

	public String getKeteranganPemesanan() {
		return keteranganPemesanan;
	}

	public void setKeteranganPemesanan(String keteranganPemesanan) {
		this.keteranganPemesanan = keteranganPemesanan;
	}

	public String getTanggalPemesanan() {
		return tanggalPemesanan;
	}

	public void setTanggalPemesanan(String tanggalPemesanan) {
		this.tanggalPemesanan = tanggalPemesanan;
	}

	public int getPemesan() {
		return pemesan;
	}

	public void setPemesan(int pemesan) {
		this.pemesan = pemesan;
	}

	public List<DetailPemesananDto> getDetailPemesanan() {
		return detailPemesanan;
	}

	public void setDetailPemesanan(List<DetailPemesananDto> detailPemesanan) {
		this.detailPemesanan = detailPemesanan;
	}
    
}