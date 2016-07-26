package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IDtiposDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeDtipos;

import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
@Repository("dtiposDao") /*La variable inyectada en el service se debe llamar igual*/
public class DtiposDaoImpl implements IDtiposDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeDlistaPrecios.class);
		
	}
	public void guardarDtipos(PymeDtipos entidad) {
		getSession().save(entidad);
	}
	public void actualizarDtipos(PymeDtipos entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
		
	}
	public void eliminarDtipos(PymeDtipos entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
		
	}
	public PymeDtipos getDtipo(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeDtipos) getSession().get(PymeDtipos.class, id);
	}
	public java.util.List<PymeDtipos> getDtipos() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
	
	
}
