package miniproject.endpoint.request.converter;


import miniproject.endpoint.request.PemesanUpdateRequest;
import miniproject.repository.dto.PemesanDto;

public interface IPemesanUpdateConverter {
	 PemesanUpdateRequest converterToRequest( PemesanDto dto);
	 PemesanDto converterToDto( PemesanUpdateRequest request);
}
