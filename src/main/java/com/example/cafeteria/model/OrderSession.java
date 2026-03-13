package com.example.cafeteria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderSession {
    private String nombreCliente;
    private int numeroMesa;
    private List<String> listaProductos;
    private String tamanio;
    private int cantidad;
    private List<String> opcionesAdicionales;
    private double total;
}
