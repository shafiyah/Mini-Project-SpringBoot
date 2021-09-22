package miniproject.endpoint.request.converter;

import miniproject.endpoint.request.BarangCreateRequest;
import miniproject.repository.dto.BarangDto;

public interface IBarangCreateConverter {
    BarangCreateRequest converterToRequest( BarangDto dto);
	BarangDto converterToDto( BarangCreateRequest request);
}
