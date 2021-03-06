package miniproject.service.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import miniproject.model.BarangModel;
import miniproject.repository.dto.BarangDto;

public interface IBarangConverter { BarangDto createFrom(BarangModel barangEntity);
	
	BarangModel createFrom(BarangDto barangDto);
	
	BarangModel updateEntity(BarangModel Entity ,BarangDto barangDto);
	
	default List<BarangDto> createFromEntities(Collection<BarangModel> barangs){
		return barangs.stream().map(this::createFrom).collect(Collectors.toList());
	}
	
	default List<BarangModel> createFromDtos(Collection< BarangDto> barangs){
		return barangs.stream().map(this::createFrom).collect(Collectors.toList());
	}
	
}
