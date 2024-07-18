package com.distribuida.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Vendedores;

@Repository

public class VendedoresDAOImpl  implements VendedoresDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Vendedores> findAll() {
	// TODO Auto-generated method stub
	Session session =sessionFactory.getCurrentSession();
	return session.createQuery("from vendedores",Vendedores.class).getResultList();
	
	
	}
	
	
	@Override
	@Transactional
	public Vendedores findOne(int id) {
	// TODO Auto-generated method stub
	Session session= sessionFactory.getCurrentSession(); 
	return session.get(Vendedores.class, id);
	}
	
	
	
	@Override
	@Transactional
	public void add(Vendedores vendedores) {
	// TODO Auto-generated method stub
		 Session session =sessionFactory.getCurrentSession();
	session.saveOrUpdate(vendedores);
	}
	
	
	@Override
	@Transactional
	public void del(int id) {
	// TODO Auto-generated method stub
		 Session session= sessionFactory.getCurrentSession();
	session.delete(findOne(id));
	}
	
	
	
	@Override
	@Transactional
	public void up (Vendedores vendedores) {
	// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(vendedores);
	}
	
}
