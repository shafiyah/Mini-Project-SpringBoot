package miniproject.endpoint.request.converter.impl;

import miniproject.endpoint.request.DetailPemesananCreateRequest;
import miniproject.endpoint.request.converter.IDetailPemesananCreateConverter;
import miniproject.repository.dto.DetailPemesananDto;


public class DetailPemesananCreateConverter implements IDetailPemesananCreateConverter{

	@Override
	public DetailPemesananCreateRequest converterToRequest(DetailPemesananDto dto) {
		DetailPemesananCreateRequest request = new DetailPemesananCreateRequest();
		request.setIdPemesanan(dto.getIdPemesanan());
		request.setIdBarang(dto.getIdBarang());
		request.setJumlahBarang(dto.getJumlah_barang());
		return request;
	}

	@Override
	public DetailPemesananDto converterToDto(DetailPemesananCreateRequest request) {
		DetailPemesananDto dto = new DetailPemesananDto();
		dto.setIdBarang(request.getIdBarang());
		dto.setIdPemesanan(request.getIdPemesanan());
		dto.setJumlah_barang(request.getJumlahBarang());
		return dto;
	}

}
