package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.IProductosDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeProductos;
/*Creado por ASANCHEZ EL 2016-07-25*/
//@Repository("productosDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class ProductosDaoImpl implements IProductosDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeProductos.class);
		
	}
	public void guardarProducto(PymeProductos entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarProducto(PymeProductos entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarProducto(PymeProductos entidad) {
		getSession().delete(entidad);		
	}

	public PymeProductos getProducto(Integer id) {
		return  (PymeProductos) getSession().get(PymeProductos.class, id);
	}

	public List<PymeProductos> getProductos() {
		return crearCriteria().list();
	}

}
