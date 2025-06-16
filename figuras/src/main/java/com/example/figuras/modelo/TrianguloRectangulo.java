package com.example.figuras.modelo;

import com.example.figuras.requerimiento.RequerimientoTrianguloRectangulo;

public class TrianguloRectangulo extends FigurasXY implements RequerimientoTrianguloRectangulo {
    
    public TrianguloRectangulo(){
        super();
    }

    @Override
    public Float calcularArea() {
        return (this.getX() * this.getY()) / 2;
    }

    @Override
    public Float calcularPerimetro() {
        return this.getX() + this.getY() + this.calcularHipotenusa();
    }

    @Override
    public Float calcularHipotenusa() {
        double hipotenusa = Math.sqrt((Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2)));
        return (float) hipotenusa;
    }

    
}
