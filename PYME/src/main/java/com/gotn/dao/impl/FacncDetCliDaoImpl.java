package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IFacncDetCliDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeFacncDetCli;
import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
@Repository("facncDetCliDao") /*La variable inyectada en el service se debe llamar igual*/
public class FacncDetCliDaoImpl implements IFacncDetCliDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeDlistaPrecios.class);
		
	}
	public void guardarFacncDetCli(PymeFacncDetCli entidad) {
		// TODO Auto-generated method stub
		getSession().save(entidad);
		
	}
	public void actualizarFacncDetCli(PymeFacncDetCli entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
	}
	public void eliminarFacncDetCli(PymeFacncDetCli entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
	}
	public PymeFacncDetCli getFacncDetCli(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeFacncDetCli) getSession().get(PymeFacncDetCli.class, id);
	}
	public java.util.List<PymeFacncDetCli> getFacncDetClis() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
}
