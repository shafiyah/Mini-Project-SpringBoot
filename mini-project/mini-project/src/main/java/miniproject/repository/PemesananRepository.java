package miniproject.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;



import miniproject.model.PemesananModel;

@Transactional
public class PemesananRepository implements IPemesananRepository {

	private EntityManager entityManager;
	
	public PemesananRepository(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	@Override
	public PemesananModel save(PemesananModel pemesanan) {
		entityManager.persist(pemesanan);
		return pemesanan;
	}

	@Override
	public PemesananModel findById(int id) {
		String hql = "from PemesananModel where id_pemesanan=:id";
		Query query = entityManager.createQuery(hql, PemesananModel.class);
		query.setParameter("id", id);
	    return(PemesananModel)query.getSingleResult(); 
	}

	@Override
	public List<PemesananModel> findAll() {
		String query = "from PemesananModel e ";
		List<PemesananModel>pemesanans = entityManager.createQuery(query,PemesananModel.class).getResultList();
		return pemesanans;
	}

	@Override
	public void deleteById(int id) {
		PemesananModel pemesanan = findById(id);
		entityManager.remove(pemesanan);
	}

	@Override
	public PemesananModel merge(PemesananModel pemesanan) {
		entityManager.merge(pemesanan);
		return pemesanan;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PemesananModel> findbyPemesanId(int id) {
		String hql = "from PemesananModel where id_pemesan=:id ";
		Query query = entityManager.createQuery(hql, PemesananModel.class);
		query.setParameter("id", id);
		List<PemesananModel>pemesanans = query.getResultList();
		return pemesanans;
	}
	
}
