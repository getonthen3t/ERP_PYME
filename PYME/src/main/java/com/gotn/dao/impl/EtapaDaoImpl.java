package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IEtapaDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeEtapa;

import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
@Repository("etapaDao") /*La variable inyectada en el service se debe llamar igual*/
public class EtapaDaoImpl implements IEtapaDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeEtapa.class);
		
	}
	public void guardarEtapa(PymeEtapa entidad) {
		// TODO Auto-generated method stub
		getSession().save(entidad);
	}
	public void actualizarEtapa(PymeEtapa entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
	}
	public void eliminarEtapa(PymeEtapa entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
	}
	public PymeEtapa getEtapa(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeEtapa) getSession().get(PymeEtapa.class, id);
	}
	public java.util.List<PymeEtapa> getEtapas() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
}
