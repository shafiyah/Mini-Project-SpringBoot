package miniproject.endpoint.request.converter.impl;


import miniproject.endpoint.request.PemesananUpdateRequest;
import miniproject.endpoint.request.converter.IPemesananUpdateConverter;
import miniproject.repository.dto.PemesananDto;

public class PemesananUpdateConverter implements IPemesananUpdateConverter{

	@Override
	public PemesananUpdateRequest converterToRequest(PemesananDto dto) {
		PemesananUpdateRequest request = new PemesananUpdateRequest();
		request.setIdPemesanan(dto.getIdPemesanan());
		request.setIdPemesan(dto.getPemesan());
		request.setKeterangan(dto.getKeteranganPemesanan());
		request.setTanggal(dto.getTanggalPemesanan());
		return request;
	}

	@Override
	public PemesananDto converterToDto(PemesananUpdateRequest request) {
		PemesananDto dto = new PemesananDto();
		dto.setIdPemesanan(request.getIdPemesanan());
		dto.setPemesan(request.getIdPemesan());
		dto.setTanggalPemesanan(request.getKeterangan());
		dto.setKeteranganPemesanan(request.getKeterangan());
		return dto;
	}

}
