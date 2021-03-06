package miniproject.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import miniproject.model.BarangModel;

@Transactional
public class BarangRepository implements IBarangRepository {

	private EntityManager entityManager;
	
	
	public BarangRepository(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public BarangModel save(BarangModel barang) {
		entityManager.persist(barang);
		return barang;
	}

	@Override
	public BarangModel findById(int id) {
		String hql = "from BarangModel where id_barang=:id";
		Query query = entityManager.createQuery(hql, BarangModel.class);
		query.setParameter("id", id);
		return(BarangModel)query.getSingleResult(); 
	}

	public EntityManager getEntityManager() {
		
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<BarangModel> findAll() {
		String query = "from BarangModel b";
		List<BarangModel> baranglList = entityManager.createQuery(query, BarangModel.class).getResultList();
		return baranglList;
	}

	@Override
	public void deleteById(int id) {
		BarangModel barang = findById(id);
		entityManager.remove(barang);
	}

	@Override
	public BarangModel merge(BarangModel barang) {
		entityManager.merge(barang);
		return barang;
	}

}
