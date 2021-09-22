package miniproject.endpoint.request.converter;

import miniproject.endpoint.request.DetailPemesananUpdateRequest;
import miniproject.repository.dto.DetailPemesananDto;

public interface IDetailPemesananUpdateConverter {
	DetailPemesananUpdateRequest converterToRequest( DetailPemesananDto dto);
	DetailPemesananDto converterToDto( DetailPemesananUpdateRequest request);
}
 