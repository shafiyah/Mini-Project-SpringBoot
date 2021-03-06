package miniproject.endpoint.request.converter;


import miniproject.endpoint.request.DetailPemesananCreateRequest;
import miniproject.repository.dto.DetailPemesananDto;

public interface IDetailPemesananCreateConverter {
	DetailPemesananCreateRequest converterToRequest( DetailPemesananDto dto);
	DetailPemesananDto converterToDto( DetailPemesananCreateRequest request);
}
