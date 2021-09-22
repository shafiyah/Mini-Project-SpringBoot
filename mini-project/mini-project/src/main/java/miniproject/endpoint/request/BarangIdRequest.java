package miniproject.endpoint.request;

import java.io.Serializable;

public class BarangIdRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idBarang;

	
	public BarangIdRequest() {}

	public BarangIdRequest(int idBarang) {
		super();
		this.idBarang = idBarang;
	}

	public int getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(int idBarang) {
		this.idBarang = idBarang;
	}

}
