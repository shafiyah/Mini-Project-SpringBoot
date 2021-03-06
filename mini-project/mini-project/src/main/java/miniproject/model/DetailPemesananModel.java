package miniproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name = "detailpemesanan")
@JsonIgnoreProperties("hibernateLazyInitializer")

public class DetailPemesananModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detail_pemesanan")
	private int idDetailpemesanan;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pemesanan")
	private PemesananModel pemesanan;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_barang")
	private BarangModel barang;
	@Column(name = "jumlah_barang")
	private int jumlah_barang;
	
	
	
	public DetailPemesananModel() {
		
	}
	
	public DetailPemesananModel(int idDetailpemesanan, PemesananModel pemesanan, BarangModel barang, int jumlah_barang) {
		super();
		this.idDetailpemesanan = idDetailpemesanan;
		this.pemesanan = pemesanan;
		this.barang = barang;
		this.jumlah_barang = jumlah_barang;
	}
	
	public int getIdDetailpemesanan() {
		return idDetailpemesanan;
	}
	public void setIdDetailpemesanan(int idDetailpemesanan) {
		this.idDetailpemesanan = idDetailpemesanan;
	}
	public PemesananModel getPemesanan() {
		return pemesanan;
	}
	public void setPemesanan(PemesananModel pemesanan) {
		this.pemesanan = pemesanan;
	}
	public void setPemesananId(int id) {
		this.pemesanan.setPemesanId(id);
	}
	public int getPemesananId() {
		return pemesanan.getIdPemesanan();
	}
	public int getIdBarang() {
		return barang.getBarangId();
	}
	public void setIdBarang(int barang) {
		this.barang.setBarangId(barang);
	}
	public BarangModel getBarang() {
		return barang;
	}
	public void setBarang(BarangModel barang) {
		this.barang = barang;
	}
	public int getJumlah_barang() {
		return jumlah_barang;
	}
	public void setJumlah_barang(int jumlah_barang) {
		this.jumlah_barang = jumlah_barang;
	}
}
