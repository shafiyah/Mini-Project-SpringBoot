package miniproject.model;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name="pemesan")
@JsonIgnoreProperties("hibernateLazyInitializer")
public class PemesanModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pemesan")
	private int idPemesan;
	@Column(name="nama_pemesan", nullable = false)
	private String namaPemesan;
	@Column(name="alamat_pemesan",nullable = false)
	private String alamatPemesan;
	@Column(name="telphone_pemesan", nullable =false)
	private String telphonePemesan;
	
	@OneToMany(mappedBy = "pemesan", cascade = CascadeType.ALL)
	private Set<PemesananModel> pemesanan;
	
	public PemesanModel() {
	}

	public PemesanModel(String namaPemesan, String alamatPemesan, String telphonePemesan, PemesananModel pemesanan) {
		super();
		this.namaPemesan = namaPemesan;
		this.alamatPemesan = alamatPemesan;
		this.telphonePemesan = telphonePemesan;
		this.pemesanan = Stream.of(pemesanan).collect(Collectors.toSet());
		this.pemesanan.forEach(x -> x.setPemesan(this));
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
	public Set<PemesananModel> getPemesanan() {
		return pemesanan;
	}

	public void setPemesanan(Set<PemesananModel> pemesanan) {
		this.pemesanan = pemesanan;
	}

}
