package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.demo.Dao.MedicamentoDao;
import com.example.demo.Service.MedicamentoService;
import com.example.demo.Service.VentaService;

@Controller
public class Controlador {

  @Autowired //Injectar metodos de accedo a DB
  private MedicamentoService medicamentoService;

  @GetMapping("/")
  public String inicio(Model model){
    var medicamento=medicamentoService.listarMedicamentos();
    model.addAttribute("medicamento", medicamento);

    return"";
  }
  
  private VentaService ventaService;
  public String inicio2(Model model){
	    var medicamento=ventaService.listarVentas();
	    model.addAttribute("medicamento", medicamento);

	    return"";
	  }
    
}
