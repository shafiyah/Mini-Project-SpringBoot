package miniproject.endpoint.request.converter.impl;

import miniproject.endpoint.request.DetailPemesananUpdateRequest;
import miniproject.endpoint.request.converter.IDetailPemesananUpdateConverter;
import miniproject.repository.dto.DetailPemesananDto;

public class DetailPemesananUpdateConverter implements IDetailPemesananUpdateConverter{

	@Override
	public DetailPemesananUpdateRequest converterToRequest(DetailPemesananDto dto) {
		DetailPemesananUpdateRequest request = new DetailPemesananUpdateRequest();
		request.setIdPemesanan(dto.getIdPemesanan());
		request.setIdBarang(dto.getIdBarang());
		request.setJumlahBarang(dto.getJumlah_barang());
		return request;
	}

	@Override
	public DetailPemesananDto converterToDto(DetailPemesananUpdateRequest request) {
		DetailPemesananDto dto = new DetailPemesananDto();
		dto.setIdPemesanan(request.getIdPemesanan());
		dto.setIdBarang(request.getIdBarang());;
		dto.setJumlah_barang(request.getJumlahBarang());
		return dto;
	}

}
