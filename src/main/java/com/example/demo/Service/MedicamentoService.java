package com.example.demo.Service;
import java.util.List;

import com.example.demo.Domain.*;

public interface MedicamentoService {

    public List<Medicamento> listarMedicamentos();

    public void guardar (Medicamento medicamento);

    public void eliminar (Medicamento medicamento);

    public Medicamento encontarMedicamento(Medicamento medicamento);

	
    
}
