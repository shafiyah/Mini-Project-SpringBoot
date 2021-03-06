package miniproject.service.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import miniproject.model.DetailPemesananModel;
import miniproject.repository.dto.DetailPemesananDto;

public interface IDetailPemesananConverter {

DetailPemesananDto createFrom(DetailPemesananModel detailPemesananEntity);

DetailPemesananModel createFrom(DetailPemesananDto detailPemesananDto);

DetailPemesananModel updateEntity(DetailPemesananModel Entity ,DetailPemesananDto barangDto);

default List<DetailPemesananDto> createFromEntities(Collection<DetailPemesananModel> detailPemesanans){
	return detailPemesanans.stream().map(this::createFrom).collect(Collectors.toList());
}

default List<DetailPemesananModel> createFromDtos(Collection< DetailPemesananDto> detailPemesanans){
	return detailPemesanans.stream().map(this::createFrom).collect(Collectors.toList());
}

}
