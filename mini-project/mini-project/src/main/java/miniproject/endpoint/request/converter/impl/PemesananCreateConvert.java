package miniproject.endpoint.request.converter.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import miniproject.endpoint.request.DetailPemesananCreateRequest;
import miniproject.endpoint.request.PemesananCreateRequest;
import miniproject.endpoint.request.converter.IPemesananCreateConverter;
import miniproject.repository.dto.DetailPemesananDto;
import miniproject.repository.dto.PemesananDto;

public class PemesananCreateConvert implements IPemesananCreateConverter{

	@Override
	public PemesananCreateRequest converterToRequest(PemesananDto dto) {
		PemesananCreateRequest request = new PemesananCreateRequest();
		request.setIdPemesan(dto.getPemesan());
		request.setKeterangan(dto.getKeteranganPemesanan());
		request.setTanggalPemesanan(dto.getTanggalPemesanan());
		return request;
	}

	@Override
	public PemesananDto converterToDto(PemesananCreateRequest request) {
		PemesananDto dto =  new PemesananDto();
		dto.setKeteranganPemesanan(request.getKeterangan());
		dto.setTanggalPemesanan(request.getTanggalPemesanan());
		dto.setPemesan(request.getIdPemesan());
		dto.setDetailPemesanan(toPemesanantoList(request.getBarangPemesanan()));
		return dto;
	}
	public List<DetailPemesananDto> toPemesanantoList (Collection<DetailPemesananCreateRequest> request) {
		return request.stream().map(this::convertTodtod).collect(Collectors.toList());
	}
	
	public DetailPemesananDto convertTodtod (DetailPemesananCreateRequest request) {
		DetailPemesananDto dto = new DetailPemesananDto();
		dto.setIdBarang(request.getIdBarang());
		dto.setJumlah_barang(request.getJumlahBarang());
		return dto;
	}

}
