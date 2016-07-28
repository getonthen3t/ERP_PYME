package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IFacncDetProvDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeFacncDetProv;

import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
//@Repository("facncDetProvDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
@SuppressWarnings({ "unchecked", "rawtypes" })
public class FacncDetProvDaoImpl implements IFacncDetProvDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeFacncDetProv.class);
		
	}
	public void guardarFacncDetProv(PymeFacncDetProv entidad) {
		// TODO Auto-generated method stub
		getSession().save(entidad);
		
	}
	public void actualizarFacncDetProv(PymeFacncDetProv entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
		
	}
	public void eliminarFacncDetProv(PymeFacncDetProv entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
	}
	public PymeFacncDetProv getFacncDetProv(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeFacncDetProv) getSession().get(PymeFacncDetProv.class, id);
	}
	public java.util.List<PymeFacncDetProv> getFacncDetProvs() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
}
