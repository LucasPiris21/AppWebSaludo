package com.example.figuras.modelo;

import com.example.figuras.requerimiento.Requerimiento;

public abstract class FigurasX implements Requerimiento {
    private Float x;

    public FigurasX() {
        this.x = 0f;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

}
