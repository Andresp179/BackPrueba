package com.example.demo.Service;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.VentaDao;
import com.example.demo.Domain.Venta;

@Service
public class VentaServiceImpl implements VentaService {

	@Autowired
	private VentaDao ventaDao;

	@Override
	public List<Venta> listarVentas() {
		return (List<Venta>) ventaDao.findAll();
	}

	@Override
	public void guardar(Venta venta) {
		ventaDao.save(venta);

	}

	@Override
	public void eliminar(Venta venta) {
		ventaDao.delete(venta);

	}

	@Override
	public Venta encuentraVenta(Venta venta) {
		return ventaDao.findById(venta.getIdventa()).orElse(null);
	}
}
