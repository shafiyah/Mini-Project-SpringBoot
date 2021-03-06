package miniproject.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(exclude="barang")
@Table(name="barang")
@JsonIgnoreProperties("hibernateLazyInitializer")

public class BarangModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_barang")
	private int idBarang;
	@Column(name = "nama_barang", nullable = false)
	private String namaBarang;
	@Column(name = "deskripsi_barang", nullable = false)
	private String deskripsiBarang;
	@Column(name = "stock_barang", nullable = false)
	private int stokBarang;
	
	public BarangModel() {
	}

	public BarangModel(int idBarang, String namaBarang, String deskripsiBarang, int stokBarang) {
		super();
		this.idBarang = idBarang;
		this.namaBarang = namaBarang;
		this.deskripsiBarang = deskripsiBarang;
		this.stokBarang = stokBarang;
	}

	public int getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(int idBarang) {
		this.idBarang = idBarang;
	}

	public int getBarangId() {
		return idBarang;
	}
	
	public void setBarangId(int idBarang) {
		this.idBarang = idBarang;
	}


	public String getNamaBarang() {
		return namaBarang;
	}


	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}


	public String getDeskripsiBarang() {
		return deskripsiBarang;
	}


	public void setDeskripsiBarang(String deskripsiBarang) {
		this.deskripsiBarang = deskripsiBarang;
	}


	public int getStokBarang() {
		return stokBarang;
	}


	public void setStokBarang(int stokBarang) {
		this.stokBarang = stokBarang;
	}	
}
