package miniproject.endpoint.request;

import java.io.Serializable;

public class PemesanNameRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	private String namaPemesan;
	
	
	public PemesanNameRequest() {}
	
	public PemesanNameRequest(String namaPemesan) {
		super();
		this.namaPemesan = namaPemesan;
	}
	public String getNamaPemesan() {
		return namaPemesan;
	}
	public void setNamaPemesan(String namaPemesan) {
		this.namaPemesan = namaPemesan;
	}
	
}
