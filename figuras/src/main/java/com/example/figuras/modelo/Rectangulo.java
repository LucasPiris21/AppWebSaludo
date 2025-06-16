package com.example.figuras.modelo;

public class Rectangulo extends FigurasXY {
    
    public Rectangulo(){
        super();
    }

    @Override
    public Float calcularArea() {
        return this.getX() * this.getY();
    }

    @Override
    public Float calcularPerimetro() {
        return (2*this.getX() + 2*this.getY());  
    }
    
}
