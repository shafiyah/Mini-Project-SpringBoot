package miniproject.repository.dto;

import java.io.Serializable;
import java.util.Set;

public class PemesanDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idPemesan;
	private String namaPemesan;
	private String alamatPemesan;
	private String telphonePemesan;
	private Set<PemesananDto> pemesanan;
	
	public PemesanDto() {
	}

	public PemesanDto(String namaPemesan, String alamatPemesan, String telphonePemesan)
	{
		super();
		this.namaPemesan = namaPemesan;
		this.alamatPemesan = alamatPemesan;
		this.telphonePemesan = telphonePemesan;
	}

	public int getIdPemesan() {
		return idPemesan;
	}

	public void setIdPemesan(int idPemesan) {
		this.idPemesan = idPemesan;
	}

	public String getNamaPemesan() {
		return namaPemesan;
	}

	public void setNamaPemesan(String namaPemesan) {
		this.namaPemesan = namaPemesan;
	}

	public String getAlamatPemesan() {
		return alamatPemesan;
	}

	public void setAlamatPemesan(String alamatPemesan) {
		this.alamatPemesan = alamatPemesan;
	}

	public String getTelphonePemesan() {
		return telphonePemesan;
	}

	public void setTelphonePemesan(String telphonePemesan) {
		this.telphonePemesan = telphonePemesan;
	}

	public Set<PemesananDto> getPemesanan() {
		return pemesanan;
	}

	public void setPemesanan(Set<PemesananDto> pemesanan) {
		this.pemesanan = pemesanan;
	}

}
