package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IFacncEncProvDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeFacncEncProv;
import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
@Repository("facncEncProvDao") /*La variable inyectada en el service se debe llamar igual*/
public class FacncEncProvDaoImpl implements IFacncEncProvDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeDlistaPrecios.class);
		
	}
	public void guardarFacncEncProv(PymeFacncEncProv entidad) {
		// TODO Auto-generated method stub
		getSession().save(entidad);
		
		
	}
	public void actualizarFacncEncProv(PymeFacncEncProv entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
	}
	public void eliminarFacncEncProv(PymeFacncEncProv entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
	}
	public PymeFacncEncProv getFacncEncProv(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeFacncEncProv) getSession().get(PymeFacncEncProv.class, id);
	}
	public java.util.List<PymeFacncEncProv> getFacncEncProvs() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
}
