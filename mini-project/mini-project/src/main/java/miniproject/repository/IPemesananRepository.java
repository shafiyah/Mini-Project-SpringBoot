package miniproject.repository;

import java.util.List;

import miniproject.model.PemesananModel;

public interface IPemesananRepository {
	public PemesananModel save(PemesananModel pemesan);
	public PemesananModel findById(int id);
	public List<PemesananModel> findAll();
	public List<PemesananModel> findbyPemesanId(int id);
	public void deleteById(int id);
	public PemesananModel merge(PemesananModel pemesan);
}
