package miniproject.endpoint.request;

import java.io.Serializable;

public class PemesanUpdateRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idPemesan;
	private String namaPemesan;
	private String telphone;
	private String alamat;
	
	
	public PemesanUpdateRequest() {}
	
	public PemesanUpdateRequest(int idPemesan, String namaPemesan, String telphone, String alamat) {
		super();
		this.idPemesan = idPemesan;
		this.namaPemesan = namaPemesan;
		this.telphone = telphone;
		this.alamat = alamat;
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
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
}
