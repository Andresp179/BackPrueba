package com.example.demo.Domain;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Data
@Entity
@Table(name="medicamento")
public class Medicamento implements Serializable  {


    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmedicamento;
    private String nombreMedicamento;
    private Date fechaFabricacion;
    private Date fechaVencimiento;
    private Long stock;
    private Long valorUnitario;
    
}
