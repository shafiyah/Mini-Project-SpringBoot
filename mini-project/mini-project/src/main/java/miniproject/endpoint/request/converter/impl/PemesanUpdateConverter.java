package miniproject.endpoint.request.converter.impl;

import miniproject.endpoint.request.PemesanUpdateRequest;
import miniproject.endpoint.request.converter.IPemesanUpdateConverter;
import miniproject.repository.dto.PemesanDto;

public class PemesanUpdateConverter implements IPemesanUpdateConverter{

	@Override
	public PemesanUpdateRequest converterToRequest(PemesanDto dto) {
		PemesanUpdateRequest request = new PemesanUpdateRequest();
		request.setIdPemesan(dto.getIdPemesan());
		request.setNamaPemesan(dto.getNamaPemesan());
		request.setAlamat(dto.getAlamatPemesan());
		request.setTelphone(dto.getTelphonePemesan());
		return  request;
	}

	@Override
	public PemesanDto converterToDto(PemesanUpdateRequest request) {
		PemesanDto dto = new PemesanDto();
		dto.setIdPemesan(request.getIdPemesan());
		dto.setNamaPemesan(request.getNamaPemesan());
		dto.setAlamatPemesan(request.getAlamat());
		dto.setTelphonePemesan(request.getTelphone());
		return dto;
	}

}
