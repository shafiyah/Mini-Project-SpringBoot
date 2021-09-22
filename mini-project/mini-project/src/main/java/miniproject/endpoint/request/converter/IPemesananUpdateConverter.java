package miniproject.endpoint.request.converter;

import miniproject.endpoint.request.PemesananUpdateRequest;
import miniproject.repository.dto.PemesananDto;

public interface IPemesananUpdateConverter {
	 PemesananUpdateRequest converterToRequest( PemesananDto dto);
	 PemesananDto converterToDto( PemesananUpdateRequest request);
}
