package miniproject.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import miniproject.model.DetailPemesananModel;

@Transactional
public class DetailPemesananRepository implements IDetailPesananRepository{

	private EntityManager entityManager;
	
	
	public DetailPemesananRepository(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public DetailPemesananModel save(DetailPemesananModel detailpemesanan) {
		entityManager.persist(detailpemesanan);
		return detailpemesanan;
	}

	@Override
	public DetailPemesananModel findById(int id) {
		String hql ="from DetailPemesananModel where id_detail_pemesanan=:id";
		Query query = entityManager.createQuery(hql, DetailPemesananModel.class);
		query.setParameter("id",id);
		return(DetailPemesananModel)query.getSingleResult();
	}

	@Override
	public List<DetailPemesananModel> findAll() {
		String query="from DetailPemesananModel dt";
		List<DetailPemesananModel> detailpemesananlist = entityManager.createQuery(query,DetailPemesananModel.class).getResultList();
		return detailpemesananlist;
	}

	@Override
	public void deleteById(int id) {
		DetailPemesananModel detailPemesanan =  findById(id);
		entityManager.remove(detailPemesanan);		
	}

	@Override
	public DetailPemesananModel merge(DetailPemesananModel detailPemesanan) {
		entityManager.merge(detailPemesanan);
		return detailPemesanan;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
