package miniproject.model;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;

@Entity
@Data
@Table(name = "pemesanan")
@JsonIgnoreProperties("hibernateLazyInitializer")
public class PemesananModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pemesanan")
	private int idPemesanan;
	@Column(name = "keterangan_pemesanan")
	private String keteranganPemesanan;
	@Column(name = "tanggal_pemesanan")
	private String tanggalPemesanan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pemesan")
	private PemesanModel pemesan;
	
	@OneToMany(mappedBy = "pemesanan", cascade = CascadeType.ALL)
	private Set<DetailPemesananModel> detailPemesanan;

	public PemesananModel() {
	}

	public PemesananModel(String keteranganPemesanan, String tanggalPemesanan,
		DetailPemesananModel detailPemesanan) {
		this.keteranganPemesanan = keteranganPemesanan;
		this.tanggalPemesanan = tanggalPemesanan;
		this.detailPemesanan = Stream.of(detailPemesanan).collect(Collectors.toSet());
		this.detailPemesanan.forEach(x -> x.setPemesanan(this));
	}
	
	public PemesananModel(String keteranganPemesanan, String tanggalPemesanan) {
		this.keteranganPemesanan = keteranganPemesanan;
		this.tanggalPemesanan = tanggalPemesanan;
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

	public PemesanModel getPemesanPemesanan() {
		return pemesan;
	}

	public void setPemesan(PemesanModel pemesan) {
		this.pemesan = pemesan;
	}
	
	public int getPemesanId() {
		return pemesan.getIdPemesan();
	}

	public void setPemesanId(int id) {
		this.pemesan.setIdPemesan(id);
	}

	public Set<DetailPemesananModel> getDetailPesanan() {
		return detailPemesanan;
	}

	public void setDetailPesanan(Set<DetailPemesananModel> detailPesanan) {
		this.detailPemesanan = detailPesanan;
	}

}
