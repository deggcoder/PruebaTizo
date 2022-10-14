/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tizo.challenge.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="CategoriaProducto")
@Data
public class CategoriaProducto implements Serializable {
    
    private static final long serializable = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCategoria;
    private String nombre;
    private String estadoCategoria;
    private LocalDate fechaCreacion;
    private LocalDate uActualizacion;
    private byte estado;
}
