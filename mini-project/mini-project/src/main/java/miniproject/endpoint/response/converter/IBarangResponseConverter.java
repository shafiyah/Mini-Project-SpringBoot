package miniproject.endpoint.response.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


import miniproject.endpoint.response.BarangResponse;
import miniproject.repository.dto.BarangDto;

public interface IBarangResponseConverter {
	BarangResponse convertToResponse (BarangDto barangDto);

	default List<BarangResponse> convertToResponses(Collection<BarangDto> barangs){
		return barangs.stream().map(this::convertToResponse).collect(Collectors.toList());
	}

}
