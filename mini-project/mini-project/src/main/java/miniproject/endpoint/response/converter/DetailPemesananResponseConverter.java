package miniproject.endpoint.response.converter;


import miniproject.endpoint.response.DetailPemesananResponse;
import miniproject.model.DetailPemesananModel;
import miniproject.repository.dto.DetailPemesananDto;


public class DetailPemesananResponseConverter implements IDetailPemesananResponseConverter{

	@Override
	public DetailPemesananResponse convertToResponse(DetailPemesananDto detailPemesananDto) {
		DetailPemesananResponse response = new DetailPemesananResponse();
		response.setIdDetailpemesanan(detailPemesananDto.getIdDetailpemesanan());
		response.setIdPemesanan(detailPemesananDto.getIdPemesanan());
		response.setidBarang(Integer.toString(detailPemesananDto.getIdBarang()));
		response.setJumlahBarang(detailPemesananDto.getJumlah_barang());
		return response;
	}

	@Override
	public DetailPemesananResponse convertToResponses(DetailPemesananModel detailPemesanan) {
		DetailPemesananResponse response = new DetailPemesananResponse();
		response.setIdDetailpemesanan(detailPemesanan.getIdDetailpemesanan());
		response.setIdPemesanan(detailPemesanan.getPemesananId());
		response.setidBarang(detailPemesanan.getBarang().getNamaBarang());
		response.setJumlahBarang(detailPemesanan.getJumlah_barang());
		return response;
	}

}
