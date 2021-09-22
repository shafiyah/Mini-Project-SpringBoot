package miniproject.repository;

import java.util.List;


import miniproject.model.DetailPemesananModel;

public interface IDetailPesananRepository {
	public DetailPemesananModel save(DetailPemesananModel detailpemesanan);
	public DetailPemesananModel findById(int id);
	public List<DetailPemesananModel> findAll();
	public void deleteById(int id);
	public DetailPemesananModel merge(DetailPemesananModel detailPemesanan);
}
