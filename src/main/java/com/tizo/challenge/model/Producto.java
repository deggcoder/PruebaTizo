package com.tizo.challenge.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="Producto")
@Data
public class Producto implements Serializable {
    
    private static final long serializable = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idProducto;
    
    private String nombre;
    private double costo;
    private double precio;
    private LocalDate fechaCreacion;
    private LocalDate uActualizacion;
    private byte estado;
    
    @ManyToOne
    @JoinColumn(name="idCategoria")
    private CategoriaProducto categoria;
}
