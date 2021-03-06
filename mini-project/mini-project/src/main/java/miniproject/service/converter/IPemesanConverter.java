package miniproject.service.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import miniproject.model.PemesanModel;
import miniproject.repository.dto.PemesanDto;



public interface IPemesanConverter {PemesanDto createFrom(PemesanModel pemesanEntity);

PemesanModel createFrom(PemesanDto pemesanDto);

PemesanModel updateEntity(PemesanModel pemesan ,PemesanDto pemesanDto);

default List<PemesanDto> createFromEntities(Collection<PemesanModel> pemesans){
	return pemesans.stream().map(this::createFrom).collect(Collectors.toList());
}

default List<PemesanModel> createFromDtos(Collection< PemesanDto> pemesans){
	return pemesans.stream().map(this::createFrom).collect(Collectors.toList());
}

}
