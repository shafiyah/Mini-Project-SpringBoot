package miniproject.endpoint.request.converter.impl;

import miniproject.endpoint.request.BarangUpdateRequest;
import miniproject.endpoint.request.converter.IBarangUpdateConverter;
import miniproject.repository.dto.BarangDto;

public class BarangUpdateConverter implements IBarangUpdateConverter {

	@Override
	public BarangUpdateRequest converterToRequest(BarangDto dto) {
		BarangUpdateRequest request = new BarangUpdateRequest();
		request.setIdBarng(dto.getIdBarang());
		request.setNamaBarang(dto.getNamaBarang());
		request.setDeskripsiBarang(dto.getDeskripsiBarang());
		request.setStock(dto.getStokBarang());
		return request;
	}
	@Override
	public BarangDto converterToDto(BarangUpdateRequest request) {
		BarangDto dto = new BarangDto();
		dto.setIdBarang(request.getIdBarang());
		dto.setNamaBarang(request.getNamaBarang());
		dto.setDeskripsiBarang(request.getDeskripsiBarang());
		dto.setStokBarang(request.getStock());
		return dto;
	}	
}
