package miniproject.service;

import java.util.List;

import miniproject.repository.dto.PemesananDto;

public interface IPemesananService {

	public PemesananDto Create(PemesananDto pemesanan);
	public PemesananDto findById(int id);
	public List<PemesananDto> findAll();
	public void deleteById(int id);
	public PemesananDto update (PemesananDto pemesanan);
}
