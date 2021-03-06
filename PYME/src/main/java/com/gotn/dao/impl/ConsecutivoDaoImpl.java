package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.model.PymeConsecutivos;
/*Creado por ASANCHEZ EL 2016-07-25*/
//@Repository("consecutivoDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class ConsecutivoDaoImpl implements IConsecutivoDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeConsecutivos.class);
		
	}
	public void guardarConsecutivo(PymeConsecutivos entidad) {
		getSession().save(entidad);
	}

	public void actualizarConsecutivo(PymeConsecutivos entidad) {
		getSession().update(entidad);
	}

	public void eliminarConsecutivo(PymeConsecutivos entidad) {
		getSession().delete(entidad);
	}

	public PymeConsecutivos getConsecutivo(Integer id) {
		return  (PymeConsecutivos) getSession().get(PymeConsecutivos.class, id);
	}
	public List<PymeConsecutivos> getConsecutivos() {
		return crearCriteria().list();
	}

}
