package miniproject.service.converter;

import miniproject.model.DetailPemesananModel;
import miniproject.repository.dto.DetailPemesananDto;



public class DetailPemesananConverter implements IDetailPemesananConverter{

	public DetailPemesananConverter() {
	}

	@Override
	public DetailPemesananDto createFrom(DetailPemesananModel detailPemesananEntity) {
		DetailPemesananDto detailPemesanan =  new DetailPemesananDto();
		detailPemesanan.setIdDetailpemesanan(detailPemesananEntity.getIdDetailpemesanan());
		detailPemesanan.setIdPemesanan(detailPemesananEntity.getPemesanan().getIdPemesanan());
		detailPemesanan.setJumlah_barang(detailPemesananEntity.getJumlah_barang());
		detailPemesanan.setIdBarang(detailPemesananEntity.getBarang().getBarangId());
		return detailPemesanan;
	}

	@Override
	public DetailPemesananModel createFrom(DetailPemesananDto detailPemesananDto) {
		return updateEntity(new DetailPemesananModel(), detailPemesananDto);
	}

	@Override
	public DetailPemesananModel updateEntity(DetailPemesananModel detailPemesanan, DetailPemesananDto detailPemesananDto) {
		detailPemesanan.setIdDetailpemesanan(detailPemesananDto.getIdDetailpemesanan());
		detailPemesanan.setJumlah_barang(detailPemesananDto.getJumlah_barang());
		return detailPemesanan;
	}
	
}
