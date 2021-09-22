package miniproject.endpoint.request;

import java.io.Serializable;

public class PemesanIdRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idPemesan;
	
	public PemesanIdRequest() {}
	
	public PemesanIdRequest(int idPemesan) {
		super();
		this.idPemesan = idPemesan;
	}
	public int getIdPemesan() {
		return idPemesan;
	}
	public void setIdPemesan(int idPemesan) {
		this.idPemesan = idPemesan;
	}
	
}
