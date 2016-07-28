package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.INdEncProvDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeNdEncProv;
/*Creado por ASANCHEZ EL 2016-07-25*/
//@Repository("ndEncProvDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
@SuppressWarnings({ "unchecked", "rawtypes" })
public class NdEncProvDaoImpl implements INdEncProvDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeNdEncProv.class);
		
	}
	public void guardarNdEncProv(PymeNdEncProv entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarNdEncProv(PymeNdEncProv entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarNdEncProv(PymeNdEncProv entidad) {
		getSession().delete(entidad);
		
	}

	public PymeNdEncProv getNdEncProv(Integer id) {
		return  (PymeNdEncProv) getSession().get(PymeNdEncProv.class, id);
	}

	public List<PymeNdEncProv> getNdEncProvs() {
		return crearCriteria().list();
	}

}
