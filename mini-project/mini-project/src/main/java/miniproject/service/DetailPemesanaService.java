package miniproject.service;

import java.util.List;

import miniproject.model.DetailPemesananModel;
import miniproject.repository.DetailPemesananRepository;
import miniproject.repository.dto.DetailPemesananDto;
import miniproject.service.converter.DetailPemesananConverter;

public class DetailPemesanaService implements IDetailPemesananService {

	private DetailPemesananRepository dao;
	private DetailPemesananConverter converter;
	
	@Override
	public DetailPemesananDto Create(DetailPemesananDto detailpemesananDto) {
		DetailPemesananModel detailpemesanan = converter.createFrom(detailpemesananDto);
		return converter.createFrom(dao.save(detailpemesanan));
	}

	@Override
	public DetailPemesananDto findById(int id) {
		DetailPemesananDto detailpemesanan = converter.createFrom(dao.findById(id));
		return detailpemesanan;
	}

	@Override
	public List<DetailPemesananDto> findAll() {
		List<DetailPemesananDto> detailpemesanans = converter.createFromEntities(dao.findAll());
		return detailpemesanans;
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);	
	}

	@Override
	public DetailPemesananDto update(DetailPemesananDto detailpemesanDto) {
		DetailPemesananModel findDetailpemesanan  = dao.findById(detailpemesanDto.getIdDetailpemesanan());
		DetailPemesananModel detailpemesanan =  converter.updateEntity(findDetailpemesanan, detailpemesanDto);
		return converter.createFrom(dao.merge(detailpemesanan));
	}

	public DetailPemesananRepository getDao() {
		return dao;
	}

	public void setDao(DetailPemesananRepository dao) {
		this.dao = dao;
	}

	public DetailPemesananConverter getConverter() {
		return converter;
	}

	public void setConverter(DetailPemesananConverter converter) {
		this.converter = converter;
	}
    
}
