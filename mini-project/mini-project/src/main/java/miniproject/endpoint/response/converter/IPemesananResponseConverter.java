package miniproject.endpoint.response.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import miniproject.endpoint.response.PemesananResponse;
import miniproject.model.PemesananModel;
import miniproject.repository.dto.PemesananDto;

public interface IPemesananResponseConverter {
	PemesananResponse convertToResponse (PemesananDto pemesanan);
	PemesananResponse convertToResponses (PemesananModel pemesanan);
	default List<PemesananResponse> convertToResponse(Collection<PemesananModel> pemesanans){
		return pemesanans.stream().map(this::convertToResponses).collect(Collectors.toList());
	}
	default List<PemesananResponse> convertToResponses(Collection<PemesananDto> pemesanans){
		return pemesanans.stream().map(this::convertToResponse).collect(Collectors.toList());
	}
}
