package miniproject.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import miniproject.model.PemesanModel;

@Transactional
public class PemesanRepository implements IPemesanRepository{

	private EntityManager entityManager;
	
	public PemesanRepository(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public PemesanModel save(PemesanModel pemesan) {
		entityManager.persist(pemesan);
		return pemesan;
	}

	@Override
	public PemesanModel findById(int id) {
		String hql = "from PemesanModel where id_pemesan=:id";
		Query query = entityManager.createQuery(hql,PemesanModel.class);
		query.setParameter("id", id);
		return (PemesanModel)query.getSingleResult();
	}

	@Override
	public List<PemesanModel> findAll() {
		String query = "from PemesanModel ps";
		List<PemesanModel> pemesanlist = entityManager.createQuery(query,PemesanModel.class).getResultList();
		return pemesanlist;
	}

	@Override
	public void deleteById(int id) {
		PemesanModel pemesan = findById(id);
		entityManager.remove(pemesan);	
	}

	@Override
	public PemesanModel merge(PemesanModel pemesan) {
		entityManager.merge(pemesan);
		return pemesan;
	}

	@Override
	public PemesanModel findByName(String name) {
		String hql = "from PemesanModel where nama_pemesan=:id";
		Query query = entityManager.createQuery(hql,PemesanModel.class);
		query.setParameter("id", name);
		return (PemesanModel)query.getSingleResult();
	}

}
