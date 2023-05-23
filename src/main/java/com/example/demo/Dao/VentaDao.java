package com.example.demo.Dao;



import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Venta;

import jakarta.transaction.Transactional;

@Repository
public interface VentaDao extends JpaRepository<Venta,Long> {

	@Transactional
	List<Venta> findByFechaInicioAndFechaFin(Date fechaInicio, Date fechaFin);
}
