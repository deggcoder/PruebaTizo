/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tizo.challenge.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Tags")
@Data
public class Tags implements Serializable {
    
    private static final long serializable = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTag;
    private String nombre;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="idProducto")
    private Producto producto;
}
