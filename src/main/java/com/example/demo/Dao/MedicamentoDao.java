package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Domain.*;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicamentoDao extends JpaRepository<Medicamento,Long>{
    
	@Transactional
	List<Medicamento> findByNombreMedicamento(String nombreMedicamento);
}
