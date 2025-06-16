package com.example.figuras.modelo;

import com.example.figuras.requerimiento.Requerimiento;

public abstract class FigurasXY implements Requerimiento {
    private Float x;
    private Float y;

    public FigurasXY() {
        this.x = 0f;
        this.y = 0f;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    
    
}
