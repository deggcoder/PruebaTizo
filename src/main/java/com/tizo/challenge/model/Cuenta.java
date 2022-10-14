/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tizo.challenge.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Cuenta")
@Data
public class Cuenta implements Serializable{
    
    private static final long serializable = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCuenta;
    private String username;
    private String clave;
    private LocalDate fechaCreacion;
    private LocalDate ultimoIngreso;
    private byte estado;
    
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;
    @OneToMany
    @JoinColumn(name="idAcceso")
    private List<Acceso> acceso;
}
