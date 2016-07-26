package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.INdDetProvDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeNdDetProv;
/*Creado por ASANCHEZ EL 2016-07-25*/
@Repository("ndDetProvDao") /*La variable inyectada en el service se debe llamar igual*/
public class NdDetProvDaoImpl implements INdDetProvDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeNdDetProv.class);
		
	}
	public void guardarNdDetProv(PymeNdDetProv entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarNdDetProv(PymeNdDetProv entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarNdDetProv(PymeNdDetProv entidad) {
		getSession().delete(entidad);
		
	}

	public PymeNdDetProv getNdDetProv(Integer id) {
		return  (PymeNdDetProv) getSession().get(PymeNdDetProv.class, id);
	}

	public List<PymeNdDetProv> getNdDetProvs() {
		return crearCriteria().list();
	}

}
