package com.example.cafeteria.model;

import lombok.*;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderConfig {

    private String nombreCliente;
    private int numeroMesa;
    private List<String> productosSeleccionados;
    private String tamanio;
    private int cantidad;
    private List<String> opcionesAdicionales;

}
