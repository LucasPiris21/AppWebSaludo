package com.example.figuras.modelo;

import com.example.figuras.requerimiento.Requerimiento01;

public abstract class Figuras implements Requerimiento01 {
    private float[] dimensiones;

    public Figuras(float x, float y) {
        this.dimensiones = new float[] {x, y};
    }

    public Figuras(float x) {
        this.dimensiones = new float[] {x};
    }

    public float[] getDimensiones() {
        return dimensiones;
    }
    
    public abstract float getAltura();
    public abstract float getBase();
    public abstract float getRadio();
}
