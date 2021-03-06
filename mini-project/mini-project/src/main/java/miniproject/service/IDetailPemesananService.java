package miniproject.service;

import java.util.List;

import miniproject.repository.dto.DetailPemesananDto;


public interface IDetailPemesananService {

	public DetailPemesananDto Create(DetailPemesananDto detailpemesanan);
	public DetailPemesananDto findById(int id);
	public List<DetailPemesananDto> findAll();
	public void deleteById(int id);
	public DetailPemesananDto update (DetailPemesananDto detailpemesan);
}
