package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.INdDetCliDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeNdDetCli;
/*Creado por ASANCHEZ EL 2016-07-25*/
//@Repository("ndDetCliDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class NdDetCliDaoImpl implements INdDetCliDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeNdDetCli.class);
		
	}
	public void guardarNdDetCli(PymeNdDetCli entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarNdDetCli(PymeNdDetCli entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarNdDetCli(PymeNdDetCli entidad) {
		getSession().delete(entidad);
		
	}

	public PymeNdDetCli getNdDetCli(Integer id) {
		return  (PymeNdDetCli) getSession().get(PymeNdDetCli.class, id);
	}

	public List<PymeNdDetCli> getNdDetClis() {
		return crearCriteria().list();
	}

}
