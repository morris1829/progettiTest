package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import domain.Bean0;

@Service
public class BeanService {

	@PersistenceContext(unitName = "testMorris")
	private EntityManager em;
	
	
	/**
	 * Transactional.TxType.REQUIRES_NEW
	 * @param b0
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public Bean0 persist(Bean0 b0)
	{
		getEm().persist(b0);
		return b0;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List <Bean0> findAll()
	{
		CriteriaBuilder cb = getEm().getCriteriaBuilder();
		CriteriaQuery<Bean0> q = (CriteriaQuery<Bean0>) cb.createQuery(Bean0.class);
		Root<Bean0> c = (Root<Bean0>) q.from(Bean0.class);
		List<Bean0> finalList = getEm().createQuery(q).getResultList();
		return finalList;
	}


	private EntityManager getEm() {
		// TODO Auto-generated method stub
		return this.em;
	}
	
	
}
