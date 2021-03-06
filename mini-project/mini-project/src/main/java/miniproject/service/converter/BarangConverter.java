package miniproject.service.converter;

import miniproject.model.BarangModel;
import miniproject.repository.dto.BarangDto;

public class BarangConverter implements IBarangConverter {
	
	public BarangConverter() {
		
	}

	@Override
	public BarangDto createFrom(BarangModel barangEntity) {
		BarangDto barangDto= new BarangDto();
		barangDto.setDeskripsiBarang(barangEntity.getDeskripsiBarang());
		barangDto.setIdBarang(barangEntity.getBarangId());
		barangDto.setNamaBarang(barangEntity.getNamaBarang());
		barangDto.setStokBarang(barangEntity.getStokBarang());	
		return barangDto;
	}

	@Override
	public BarangModel createFrom(BarangDto barangDto) {
		BarangModel barang= new BarangModel();
		barang.setDeskripsiBarang(barangDto.getDeskripsiBarang());
		barang.setNamaBarang(barangDto.getNamaBarang());
		barang.setStokBarang(barangDto.getStokBarang());	
		return barang;
	}

	@Override
	public BarangModel updateEntity(BarangModel barang, BarangDto barangDto) {
		barang.setDeskripsiBarang(barangDto.getDeskripsiBarang());
		barang.setIdBarang(barangDto.getIdBarang());
		barang.setNamaBarang(barangDto.getNamaBarang());
		barang.setStokBarang(barangDto.getStokBarang());	
		return barang;
	}
	

}
