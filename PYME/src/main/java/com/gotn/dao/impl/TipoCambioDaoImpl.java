package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.ITipoCambioDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeTipoCambio;
@Repository("tipoCambioDao") /*La variable inyectada en el service se debe llamar igual*/
public class TipoCambioDaoImpl implements ITipoCambioDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeTipoCambio.class);
		
	}
	public void guardarTipoCambio(PymeTipoCambio entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarTipoCambio(PymeTipoCambio entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarTipoCambio(PymeTipoCambio entidad) {
		getSession().delete(entidad);
		
	}

	public PymeTipoCambio getTipoCambio(Integer id) {
		return  (PymeTipoCambio) getSession().get(PymeTipoCambio.class, id);
	}

	public List<PymeTipoCambio> getTiposCambio() {
		return crearCriteria().list();
	}

}
