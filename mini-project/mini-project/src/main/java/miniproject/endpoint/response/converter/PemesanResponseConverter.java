package miniproject.endpoint.response.converter;

import miniproject.endpoint.response.PemesanResponse;
import miniproject.repository.dto.PemesanDto;

public class PemesanResponseConverter implements IPemesanResponseConverter {

	@Override
	public PemesanResponse convertToResponse(PemesanDto pemesanDto) {
		PemesanResponse response = new PemesanResponse();
		response.setIdPemesan(pemesanDto.getIdPemesan());
		response.setNamaPemesan(pemesanDto.getNamaPemesan());
		response.setAlamatPemesan(pemesanDto.getAlamatPemesan());
		response.setTelphonePemesan(pemesanDto.getTelphonePemesan());
		return response;
	}

}
