package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IFacncEncCliDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeFacncEncCli;

import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
//@Repository("facncEncCliDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class FacncEncCliDaoImpl implements IFacncEncCliDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeFacncEncCli.class);
		
	}
	public void guardarFacncEncCli(PymeFacncEncCli entidad) {
		// TODO Auto-generated method stub
		getSession().save(entidad);
		
		
	}
	public void actualizarFacncEncCli(PymeFacncEncCli entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
	}
	public void eliminarFacncEncCli(PymeFacncEncCli entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
	}
	public PymeFacncEncCli getFacncEncCli(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeFacncEncCli) getSession().get(PymeFacncEncCli.class, id);
	}
	public java.util.List<PymeFacncEncCli> getFacncEncClis() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
}
