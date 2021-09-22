package miniproject.endpoint.response;

public class PemesananBaseResponse {
	
	public String pesan;
	public PemesananResponse pemesananRespone;
	
	
	public PemesananBaseResponse() {}


	public PemesananBaseResponse(PemesananResponse pemesananRespone) {
		this.pesan = "Pesanan telah diterima dengan nomor register "+pemesananRespone.getIdPemesanan();
		this.pemesananRespone = pemesananRespone;
	}
	
}
