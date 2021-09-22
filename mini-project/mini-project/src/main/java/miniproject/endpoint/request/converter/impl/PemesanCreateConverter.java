package miniproject.endpoint.request.converter.impl;

import miniproject.endpoint.request.PemesanCreateRequest;
import miniproject.endpoint.request.converter.IPemesanCreateConverter;
import miniproject.repository.dto.PemesanDto;



public class PemesanCreateConverter implements IPemesanCreateConverter {

	@Override
	public PemesanCreateRequest converterToRequest(PemesanDto dto) {
		PemesanCreateRequest request = new PemesanCreateRequest();
		request.setAlamatPemesan(dto.getAlamatPemesan());
		request.setNamaPemesan(dto.getNamaPemesan());
		request.setTelphonePemesan(dto.getTelphonePemesan());
		return request;
	}

	@Override
	public PemesanDto converterToDto(PemesanCreateRequest request) {
		PemesanDto dto = new PemesanDto();
		dto.setNamaPemesan(request.getNamaPemesan());
		dto.setAlamatPemesan(request.getAlamatPemesan());
		dto.setTelphonePemesan(request.getTelphonePemesan());
		return dto;
	}
	
}
