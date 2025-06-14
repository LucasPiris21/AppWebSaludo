package com.example.figuras.modelo;

import com.example.figuras.requerimiento.Requerimiento01;

public abstract class Figuras implements Requerimiento01 {
    private float[] dimensiones;

    public Figuras(float x, float y, float z) {
        this.dimensiones = new float[] {x, y, z};
    }

    public Figuras(float x, float y) {
        this.dimensiones = new float[] {x, y};
    }

    public Figuras(float x) {
        this.dimensiones = new float[] {x};
    }

    public float[] getDimensiones() {
        return dimensiones;
    }
    
    
}
