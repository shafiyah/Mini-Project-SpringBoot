package miniproject.service.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import miniproject.model.PemesananModel;
import miniproject.repository.dto.PemesananDto;


public interface IPemesananConverter {PemesananDto createFrom(PemesananModel pemesananEntity);

PemesananModel createFrom(PemesananDto pemesananDto);

PemesananModel updateEntity(PemesananModel Entity ,PemesananDto pemesananDto);

PemesananDto convertToDto(PemesananModel Entity);

default List<PemesananDto> createFromEntities(Collection<PemesananModel> pemesanans){
	return pemesanans.stream().map(this::convertToDto).collect(Collectors.toList());
}

default List<PemesananModel> createFromDtos(Collection< PemesananDto> pemesanans){
	return pemesanans.stream().map(this::createFrom).collect(Collectors.toList());
}

}
