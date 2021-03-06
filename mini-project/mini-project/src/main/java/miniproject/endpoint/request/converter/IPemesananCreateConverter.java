package miniproject.endpoint.request.converter;


import miniproject.endpoint.request.DetailPemesananCreateRequest;
import miniproject.endpoint.request.PemesananCreateRequest;
import miniproject.repository.dto.DetailPemesananDto;
import miniproject.repository.dto.PemesananDto;

public interface IPemesananCreateConverter {
	 PemesananCreateRequest converterToRequest( PemesananDto dto);
	 PemesananDto converterToDto( PemesananCreateRequest request);
	 DetailPemesananDto convertTodtod(DetailPemesananCreateRequest request);
	 
}
