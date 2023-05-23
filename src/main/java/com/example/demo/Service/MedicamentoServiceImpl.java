package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.TypedSort;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.Dao.MedicamentoDao;
import com.example.demo.Domain.Medicamento;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

	@Autowired
	private MedicamentoDao medicamentoDao;

	@Override
	public List<Medicamento> listarMedicamentos() {
		return (List<Medicamento>) medicamentoDao.findAll();
	}

	@Override
	public void guardar(Medicamento medicamento) {
		medicamentoDao.save(medicamento);
	}

	@Override
	public void eliminar(Medicamento medicamento) {
		medicamentoDao.delete(medicamento);
	}

	@Override
	public Medicamento encontarMedicamento(Medicamento medicamento) {
		return medicamentoDao.findById(medicamento.getIdmedicamento()).orElse(null);
	}
	
	

	
}
