package miniproject.endpoint.response.converter;

import miniproject.endpoint.response.BarangResponse;
import miniproject.repository.dto.BarangDto;

public class BarangResponseConverter implements IBarangResponseConverter{

	@Override
	public BarangResponse convertToResponse(BarangDto barangDto) {
		BarangResponse response = new BarangResponse();
		response.setIdBarang(barangDto.getIdBarang());
		response.setNamaBarang(barangDto.getNamaBarang());
		response.setDeskripsiBarang(barangDto.getDeskripsiBarang());
		response.setStokBarang(barangDto.getStokBarang());
		return response;
	}

}
