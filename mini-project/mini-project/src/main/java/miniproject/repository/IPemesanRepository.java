package miniproject.repository;

import java.util.List;

import miniproject.model.PemesanModel;


public interface IPemesanRepository {
	public PemesanModel save(PemesanModel pemesan);
	public PemesanModel findById(int id);
	public PemesanModel findByName(String name);
	public List<PemesanModel> findAll();
	public void deleteById(int id);
	public PemesanModel merge(PemesanModel pemesan);
}
