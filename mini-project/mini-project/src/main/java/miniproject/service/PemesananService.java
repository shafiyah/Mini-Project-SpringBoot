package miniproject.service;

import java.util.List;

import miniproject.model.PemesananModel;
import miniproject.repository.PemesananRepository;
import miniproject.repository.dto.PemesananDto;
import miniproject.service.converter.PemesananConverter;

public class PemesananService implements IPemesananService{

	private PemesananConverter converter; 
	private PemesananRepository dao;
	
	
	public PemesananConverter getConverter() {
		return converter;
	}

	public void setConverter(PemesananConverter converter) {
		this.converter = converter;
	}

	public PemesananRepository getDao() {
		return dao;
	}

	public void setDao(PemesananRepository dao) {
		this.dao = dao;
	}

	@Override
	public PemesananDto Create(PemesananDto pemesananDto) {
		PemesananModel pemesanan= converter.createFrom(pemesananDto);
		return converter.convertCreat(dao.save(pemesanan));
	}
	
	public PemesananDto Insert(PemesananModel pemesanan) {
		return converter.createFrom(dao.save(pemesanan));
	}

	@Override
	public PemesananDto findById(int id) {
		PemesananDto pemesanans  = converter.convertToDto(dao.findById(id));
		return pemesanans;
	}

	@Override
	public PemesananDto update(PemesananDto pemesananDto) {
		PemesananModel findPemesanan = dao.findById(pemesananDto.getIdPemesanan());
		PemesananModel pemesanan = converter.updateEntity(findPemesanan, pemesananDto);
		return converter.createFrom(dao.merge(pemesanan));
	}

	@Override
	public List<PemesananDto> findAll() {
		List<PemesananDto> pemesanans = converter.createFromEntities(dao.findAll());
		return pemesanans;
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}
}
