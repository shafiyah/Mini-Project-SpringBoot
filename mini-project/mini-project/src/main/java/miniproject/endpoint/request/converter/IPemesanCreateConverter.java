package miniproject.endpoint.request.converter;


import miniproject.endpoint.request.PemesanCreateRequest;
import miniproject.repository.dto.PemesanDto;

public interface IPemesanCreateConverter {
	 PemesanCreateRequest converterToRequest( PemesanDto dto);
	 PemesanDto converterToDto( PemesanCreateRequest request);
}
