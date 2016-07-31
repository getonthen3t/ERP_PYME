package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gotn.dao.IProyectoDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeProyecto;
//@Repository("proyectoDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
@Transactional
public class ProyectoDaoImpl implements IProyectoDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeProyecto.class);
		
	}
	
	public void guardarProyecto(PymeProyecto entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarProyecto(PymeProyecto entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarProyecto(PymeProyecto entidad) {
		getSession().delete(entidad);
		
	}

	public PymeProyecto getProyecto(Integer id) {
		return  (PymeProyecto) getSession().get(PymeProyecto.class, id);
	}

	public List<PymeProyecto> getProyectos() {
		return crearCriteria().list();
	}

}
