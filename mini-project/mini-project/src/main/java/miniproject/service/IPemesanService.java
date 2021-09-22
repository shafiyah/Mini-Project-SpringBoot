package miniproject.service;

import java.util.List;

import miniproject.repository.dto.PemesanDto;

public interface IPemesanService {
	
	public PemesanDto Create(PemesanDto pemesan);
	public PemesanDto findById(int id);
	public PemesanDto findByName(String id);
	public List<PemesanDto> findAll();
	public void deleteById(int id);
	public PemesanDto update (PemesanDto pemesan);

}
