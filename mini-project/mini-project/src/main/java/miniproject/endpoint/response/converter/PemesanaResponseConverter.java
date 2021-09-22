package miniproject.endpoint.response.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import miniproject.endpoint.response.DetailPemesananResponse;
import miniproject.endpoint.response.PemesananResponse;
import miniproject.model.DetailPemesananModel;
import miniproject.model.PemesananModel;
import miniproject.repository.dto.DetailPemesananDto;
import miniproject.repository.dto.PemesananDto;


public class PemesanaResponseConverter implements IPemesananResponseConverter{

	@Override
	public PemesananResponse convertToResponse(PemesananDto pemesananDto) {
		PemesananResponse response = new PemesananResponse();
		response.setIdPemesanan(pemesananDto.getIdPemesanan());
		response.setIdPemesan(String.valueOf(pemesananDto.getPemesan()));
		response.setKeteranganPesanan(pemesananDto.getKeteranganPemesanan());
		response.setTanggalPemesanan(pemesananDto.getTanggalPemesanan());
		response.setListDetailPemesananResponse(PemesanandetaildtoConvert(pemesananDto.getDetailPemesanan()));
		return response;
	}

	@Override
	public PemesananResponse convertToResponses(PemesananModel pemesanan) {
		PemesananResponse response = new PemesananResponse();
		response.setIdPemesanan(pemesanan.getIdPemesanan());
		response.setIdPemesan(pemesanan.getPemesanPemesanan().getNamaPemesan());
		response.setKeteranganPesanan(pemesanan.getKeteranganPemesanan());
		response.setTanggalPemesanan(pemesanan.getTanggalPemesanan());
		response.setListDetailPemesananResponse(PemesanandetailConvert(pemesanan.getDetailPesanan()));
		return response;
	}
	public List<DetailPemesananResponse>PemesanandetailConvert(Set<DetailPemesananModel> detail){
		List<DetailPemesananResponse> detailPemesanalist = new ArrayList<DetailPemesananResponse>();
		detail.stream().forEach(x -> detailPemesanalist.add(convertToResponsedetail(x)));
		return detailPemesanalist;
	}
	
	public DetailPemesananResponse convertToResponsedetaildto(DetailPemesananDto detailPemesanan) {
		DetailPemesananResponse response = new DetailPemesananResponse();
		response.setIdDetailpemesanan(detailPemesanan.getIdDetailpemesanan());
		response.setIdPemesanan(detailPemesanan.getIdPemesanan());
		response.setidBarang(Integer.toString(detailPemesanan.getIdBarang()));
		response.setJumlahBarang(detailPemesanan.getJumlah_barang());
		return response;
	}
	public List<DetailPemesananResponse>PemesanandetaildtoConvert(List<DetailPemesananDto> detail){
		List<DetailPemesananResponse> detailPemesanalist = new ArrayList<DetailPemesananResponse>();
		detail.stream().forEach(x -> detailPemesanalist.add(convertToResponsedetaildto(x)));
		return detailPemesanalist;
	}
	
	public DetailPemesananResponse convertToResponsedetail(DetailPemesananModel detailPemesanan) {
		DetailPemesananResponse response = new DetailPemesananResponse();
		response.setIdDetailpemesanan(detailPemesanan.getIdDetailpemesanan());
		response.setIdPemesanan(detailPemesanan.getPemesananId());
		response.setidBarang(detailPemesanan.getBarang().getNamaBarang());
		response.setJumlahBarang(detailPemesanan.getJumlah_barang());
		return response;
	}
	

}
