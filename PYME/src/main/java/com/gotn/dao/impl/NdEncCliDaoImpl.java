package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.INdEncCliDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeNdEncCli;
/*Creado por ASANCHEZ EL 2016-07-25*/
//@Repository("ndEncCliDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class NdEncCliDaoImpl implements INdEncCliDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeNdEncCli.class);	
	}
	
	public void guardarNdEncCli(PymeNdEncCli entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarNdEncCli(PymeNdEncCli entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarNdEncCli(PymeNdEncCli entidad) {
		getSession().delete(entidad);
		
	}

	public PymeNdEncCli getNdEncCli(Integer id) {
		return  (PymeNdEncCli) getSession().get(PymeNdEncCli.class, id);
	}

	public List<PymeNdEncCli> getNdEncClis() {
		return crearCriteria().list();
	}

}
