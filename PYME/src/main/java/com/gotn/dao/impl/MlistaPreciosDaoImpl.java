package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IMlistaPreciosDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeMlistaPrecios;
import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
//@Repository("mlistaPreciosDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class MlistaPreciosDaoImpl implements IMlistaPreciosDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeMlistaPrecios.class);
		
	}
	public void guardarMlistaPrecios(PymeMlistaPrecios entidad) {
		// TODO Auto-generated method stub
		getSession().save(entidad);
		
	}
	public void actualizarMlistaPrecios(PymeMlistaPrecios entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
	}
	public void eliminarMlistaPrecios(PymeMlistaPrecios entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
	}
	public PymeMlistaPrecios getMlistaPrecio(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeMlistaPrecios) getSession().get(PymeMlistaPrecios.class, id);
	}
	public java.util.List<PymeMlistaPrecios> getMlistaPrecios() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
}
