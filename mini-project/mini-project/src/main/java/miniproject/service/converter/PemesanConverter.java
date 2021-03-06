package miniproject.service.converter;


import miniproject.model.PemesanModel;
import miniproject.repository.dto.PemesanDto;

public class PemesanConverter implements IPemesanConverter {
	
	public PemesanConverter() {
		
	}

	@Override
	public PemesanDto createFrom(PemesanModel pemesanEntity) {
		PemesanDto pemesanDto = new PemesanDto();
		pemesanDto.setAlamatPemesan(pemesanEntity.getAlamatPemesan());
		pemesanDto.setIdPemesan(pemesanEntity.getIdPemesan());
		pemesanDto.setNamaPemesan(pemesanEntity.getNamaPemesan());
		pemesanDto.setTelphonePemesan(pemesanEntity.getTelphonePemesan());	
		return pemesanDto;
	}

	@Override
	public PemesanModel createFrom(PemesanDto pemesanDto) {
		return updateEntity(new PemesanModel(), pemesanDto);
	}

	@Override
	public PemesanModel updateEntity(PemesanModel pemesan, PemesanDto pemesanDto) {
		pemesan.setAlamatPemesan(pemesanDto.getAlamatPemesan());
		pemesan.setIdPemesan(pemesanDto.getIdPemesan());
		pemesan.setNamaPemesan(pemesanDto.getNamaPemesan());
		pemesan.setTelphonePemesan(pemesanDto.getTelphonePemesan());
		return pemesan;
	}
}
