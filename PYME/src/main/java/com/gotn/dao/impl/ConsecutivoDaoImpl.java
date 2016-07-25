package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.model.PymeConsecutivos;

public class ConsecutivoDaoImpl implements IConsecutivoDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
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
		// TODO Auto-generated method stub
		return null;
	}

}
