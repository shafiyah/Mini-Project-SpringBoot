package miniproject.endpoint.request.converter.impl;

import miniproject.endpoint.request.BarangCreateRequest;
import miniproject.endpoint.request.converter.IBarangCreateConverter;
import miniproject.repository.dto.BarangDto;

public class BarangCreateConverter implements IBarangCreateConverter {

	@Override
	public BarangCreateRequest converterToRequest(BarangDto dto) {
		BarangCreateRequest converter = new BarangCreateRequest();
		converter.setNamaBarang(dto.getNamaBarang());
		converter.setDeskripsiBarang(dto.getDeskripsiBarang());
		converter.setStock(dto.getStokBarang());
		return converter;
	}

	@Override
	public BarangDto converterToDto(BarangCreateRequest request) {
		BarangDto dto = new BarangDto();
		dto.setNamaBarang(request.getNamaBarang());
		dto.setDeskripsiBarang(request.getDeskripsiBarang());
		dto.setStokBarang(request.getStock());
		return dto;
	}

}
