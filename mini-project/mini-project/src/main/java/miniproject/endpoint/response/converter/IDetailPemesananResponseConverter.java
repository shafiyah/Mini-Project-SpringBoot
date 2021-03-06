package miniproject.endpoint.response.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import miniproject.endpoint.response.DetailPemesananResponse;
import miniproject.model.DetailPemesananModel;
import miniproject.repository.dto.DetailPemesananDto;

public interface IDetailPemesananResponseConverter {
	DetailPemesananResponse convertToResponse (DetailPemesananDto detailPemesananDto);
	DetailPemesananResponse convertToResponses (DetailPemesananModel detailPemesananDto);

	default List<DetailPemesananResponse> convertToResponse(Collection<DetailPemesananDto> detailPemesanans){
		return detailPemesanans.stream().map(this::convertToResponse).collect(Collectors.toList());
	}
	default List<DetailPemesananResponse> convertToResponses(Collection<DetailPemesananModel> detailPemesanans){
		return detailPemesanans.stream().map(this::convertToResponses).collect(Collectors.toList());
	}


}
