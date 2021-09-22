package miniproject.endpoint.request;

import java.io.Serializable;

public class PemesanCreateRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String namaPemesan;
	private String alamatPemesan;
	private String telphonePemesan;
	
	public PemesanCreateRequest() {}
	
	public PemesanCreateRequest(String namaPemesan, String alamatPemesan, String telphonePemesan) {
		super();
		this.namaPemesan = namaPemesan;
		this.alamatPemesan = alamatPemesan;
		this.telphonePemesan = telphonePemesan;
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
