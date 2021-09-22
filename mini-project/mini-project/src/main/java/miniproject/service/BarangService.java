package miniproject.service;

import java.util.List;

import miniproject.model.BarangModel;
import miniproject.repository.BarangRepository;
import miniproject.repository.dto.BarangDto;
import miniproject.service.converter.BarangConverter;

public class BarangService implements IBarangService{

	private BarangRepository dao;
	private BarangConverter converter;
	
	@Override
	public BarangDto Create(BarangDto barangDto) {
		BarangModel barang = converter.createFrom(barangDto);
		return converter.createFrom(dao.save(barang));
	}

	@Override
	public BarangDto findById(int id) {
		BarangDto barang = converter.createFrom(dao.findById(id));
		return barang;
	}

	@Override
	public List<BarangDto> findAll() {
		List<BarangDto> barangs =  converter.createFromEntities(dao.findAll());
		return barangs;
	}

	@Override
	public void deleteById(int id) {
		//BarangDto barang = converter.createFrom(dao.findById(id));
		dao.deleteById(id);
		
	}

	@Override
	public BarangDto update(BarangDto barangDto) {
		BarangModel findBarang = dao.findById(barangDto.getIdBarang());
		//if (findEmployee==(null))
			//throw new RecordNotFoundException("Employee not found for this id :: " + employeeDto.getEmployeeId());
		BarangModel barang=converter.updateEntity(findBarang, barangDto);
		return converter.createFrom(dao.merge(barang));
	}

	public BarangRepository getDao() {
		return dao;
	}

	public void setDao(BarangRepository dao) {
		this.dao = dao;
	}

	public BarangConverter getConverter() {
		return converter;
	}

	public void setConverter(BarangConverter converter) {
		this.converter = converter;
	}
	
	
}
