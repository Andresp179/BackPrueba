package com.example.demo.Service;
import com.example.demo.Domain.*;
import java.util.List;

public interface VentaService {
	
	public List<Venta> listarVentas();
	
	public void guardar(Venta venta);
	
	public void eliminar(Venta venta);
	
	public Venta encuentraVenta(Venta venta);

}
