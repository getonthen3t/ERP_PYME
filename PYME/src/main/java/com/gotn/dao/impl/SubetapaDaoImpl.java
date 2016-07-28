package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.ISubetapaDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeSubetapa;
//@Repository("subetapaDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class SubetapaDaoImpl implements ISubetapaDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeSubetapa.class);
		
	}
	
	public void guardarSubetapa(PymeSubetapa entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarSubetapa(PymeSubetapa entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarSubetapa(PymeSubetapa entidad) {
		getSession().delete(entidad);
		
	}

	public PymeSubetapa getSubetapa(Integer id) {
		return  (PymeSubetapa) getSession().get(PymeSubetapa.class, id);
	}

	public List<PymeSubetapa> getSubetapas() {
		return crearCriteria().list();
	}

}
