package com.example.figuras.modelo;

import com.example.figuras.requerimiento.RequerimientoCirculo;

public class Circulo extends FigurasX implements RequerimientoCirculo {

    public Circulo() {
        super();
    }

    @Override
    public Float calcularArea() {
        double area = Math.PI * Math.pow(this.getX(), 2);
        return (float) area ;
    }

    @Override
    public Float calcularPerimetro() {
        double perimetro = Math.PI * this.calcularDiametro();
        return (float) perimetro;
    }

    @Override
    public Float calcularDiametro() {
        return 2 * this.getX();
    }

    

}
