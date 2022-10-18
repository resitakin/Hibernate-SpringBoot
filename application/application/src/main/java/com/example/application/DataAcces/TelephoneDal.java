package com.example.application.DataAcces;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.application.Entities.Telephone;


// JPA-ORM
@Repository
public class TelephoneDal implements ITelephoneDal {
	private EntityManager entityManager;
	
	@Autowired
	public TelephoneDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Telephone> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Telephone> telephone=session.createQuery("from Telephone",Telephone.class).getResultList();
		return telephone;
	}

	@Override
	public void add(Telephone telephone) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(telephone);
		
	}

	@Override
	public void update(Telephone telephone) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(telephone);
		
	}

	@Override
	public void delete(Telephone telephone) {
		Session session=entityManager.unwrap(Session.class);
		Telephone telephoneToDelete = session.get(Telephone.class,telephone.getId());
		session.delete(telephoneToDelete);
	}

	@Override
	public Telephone getByid(int id) {
		Session session=entityManager.unwrap(Session.class);
		Telephone telephone=session.get(Telephone.class,id);
		return telephone;
	}
	

}
