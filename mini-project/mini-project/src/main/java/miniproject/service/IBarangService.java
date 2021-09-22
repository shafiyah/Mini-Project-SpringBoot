package miniproject.service;

import java.util.List;

import miniproject.repository.dto.BarangDto;


public interface IBarangService {

	public BarangDto Create(BarangDto barang);
	public BarangDto findById(int id);
	public List<BarangDto> findAll();
	public void deleteById(int id);
	public BarangDto update ( BarangDto barang);
}
