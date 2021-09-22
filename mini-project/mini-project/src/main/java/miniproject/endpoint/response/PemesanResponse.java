package miniproject.endpoint.response;

import java.io.Serializable;

public class PemesanResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idPemesan;
	private String namaPemesan;
	private String alamatPemesan;
	private String telphonePemesan;
	
	public PemesanResponse() {
		super();
	}

	public PemesanResponse(int idPemesan, String namaPemesan, String alamatPemesan, String telphonePemesan) {
		super();
		this.idPemesan = idPemesan;
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
	
}
