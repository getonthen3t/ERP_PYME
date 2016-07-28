package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IEmpresaDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeEmpresa;

import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
//@Repository("empresaDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class EmpresaDaoImpl implements IEmpresaDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeEmpresa.class);
		
	}
	public void guardarEmpresa(PymeEmpresa entidad) {
		// TODO Auto-generated method stub
		getSession().save(entidad);
		
	}
	public void actualizarEmpresa(PymeEmpresa entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
	}
	public void eliminarEmpresa(PymeEmpresa entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
	}
	public PymeEmpresa getEmpresa(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeEmpresa) getSession().get(PymeEmpresa.class, id);
	}
	public java.util.List<PymeEmpresa> getEmpresas() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
}
