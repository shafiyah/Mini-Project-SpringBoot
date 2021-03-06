package miniproject.service;

import java.util.List;

import miniproject.model.PemesanModel;
import miniproject.repository.PemesanRepository;
import miniproject.repository.dto.PemesanDto;
import miniproject.service.converter.PemesanConverter;

public class PemesanService implements IPemesanService{

	private PemesanRepository dao;
	private PemesanConverter converter;
	
	@Override
	public PemesanDto Create(PemesanDto pemesanDto) {
		PemesanModel pemesan = converter.createFrom(pemesanDto);
		return converter.createFrom(dao.save(pemesan));
	}

	@Override
	public PemesanDto findById(int id) {
		PemesanDto pemesan = converter.createFrom(dao.findById(id));
		return pemesan;
	}

	@Override
	public List<PemesanDto> findAll() {
		List<PemesanDto> pemesans = converter.createFromEntities(dao.findAll());
		return pemesans;
	}

	@Override
	public void deleteById(int id) {
		//PemesanDto pemesan = converter.createFrom(dao.findById(id));
		dao.deleteById(id);
	}

	@Override
	public PemesanDto update(PemesanDto pemesanDto) {
		PemesanModel pemesanFind= dao.findById(pemesanDto.getIdPemesan());
		PemesanModel pemesan = converter.updateEntity(pemesanFind, pemesanDto);
		return converter.createFrom(dao.merge(pemesan));
	}

	public PemesanRepository getDao() {
		return dao;
	}

	public void setDao(PemesanRepository dao) {
		this.dao = dao;
	}

	public PemesanConverter getConverter() {
		return converter;
	}

	public void setConverter(PemesanConverter converter) {
		this.converter = converter;
	}

	@Override
	public PemesanDto findByName(String name) {
		PemesanDto pemesan = converter.createFrom(dao.findByName(name));
		return pemesan;
	}
}
