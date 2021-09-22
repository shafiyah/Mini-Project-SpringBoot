package miniproject.endpoint.request.converter;


import miniproject.endpoint.request.BarangUpdateRequest;
import miniproject.repository.dto.BarangDto;

public interface IBarangUpdateConverter {
	 BarangUpdateRequest converterToRequest( BarangDto dto);
	 BarangDto converterToDto( BarangUpdateRequest request);
}
