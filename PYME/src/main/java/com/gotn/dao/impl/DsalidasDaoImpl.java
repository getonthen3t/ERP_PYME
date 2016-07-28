package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IDsalidasDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeDsalidas;

import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
//@Repository("dsalidasDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class DsalidasDaoImpl implements IDsalidasDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeDsalidas.class);
		
	}
	public void guardarDsalidas(PymeDsalidas entidad) {
		getSession().save(entidad);
		
	}
	public void actualizarDsalidas(PymeDsalidas entidad) {
		getSession().update(entidad);
		
	}
	public void eliminarDsalidas(PymeDsalidas entidad) {
		getSession().delete(entidad);
		
	}
	public PymeDsalidas getDsalida(Integer id) {
		return  (PymeDsalidas) getSession().get(PymeDsalidas.class, id);
	}
	public java.util.List<PymeDsalidas> getDsalidas() {
		return crearCriteria().list();
	}
}
