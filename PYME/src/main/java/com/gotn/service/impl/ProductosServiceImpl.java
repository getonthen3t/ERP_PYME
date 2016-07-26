package com.gotn.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IProductosDao;
import com.gotn.model.PymeProductos;
import com.gotn.service.IProductosService;
/*Creado por: jjara 2016-07-26*/
@Service("productosService")
public class ProductosServiceImpl implements IProductosService {
	@Autowired
	private IProductosDao productosDao;
	public boolean guardarProducto(PymeProductos pojo) {
		try {
			productosDao.guardarProducto(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Productos >> "+e);
			return false;
		}
	}

	public boolean actualizarProducto(PymeProductos pojo) {
		try {
			productosDao.actualizarProducto(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Productos >> "+e);
			return false;
		}
	}

	public boolean eliminarProducto(PymeProductos pojo) {
		try {
			productosDao.eliminarProducto(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Productos >> "+e);
			return false;
		}
	}

	public PymeProductos getProducto(int idProducto) {
		try {
			return productosDao.getProducto(idProducto);
		} catch (Exception e) {
			System.out.println("Error obteniendo Productos >> "+e);
			return null;
		}
	}

	public List<PymeProductos> getProductos() {
		try {
			return productosDao.getProductos();
		} catch (Exception e) {
			System.out.println("Error guardando Productos >> "+e);
			return null;
		}
	}

}
