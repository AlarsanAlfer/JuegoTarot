package org.example;

import lombok.Data;

@Data
public class Carta {
    private int id;
    private String nombre;
    private String imagen;

    public Carta(int id, String nombre, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }


}
