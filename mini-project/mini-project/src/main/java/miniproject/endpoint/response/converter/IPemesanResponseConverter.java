package miniproject.endpoint.response.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import miniproject.endpoint.response.PemesanResponse;
import miniproject.repository.dto.PemesanDto;

public interface IPemesanResponseConverter {
	PemesanResponse convertToResponse (PemesanDto pemesanDto);

	default List<PemesanResponse> convertToResponses(Collection<PemesanDto> pemesans){
		return pemesans.stream().map(this::convertToResponse).collect(Collectors.toList());
	}
}
