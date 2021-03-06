package miniproject.repository;

import java.util.List;

import miniproject.model.BarangModel;

public interface IBarangRepository {
	public BarangModel save(BarangModel barang);
	public BarangModel findById(int id);
	public List<BarangModel> findAll();
	public void deleteById(int id);
	public BarangModel merge(BarangModel barang);
}
