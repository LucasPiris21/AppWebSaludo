package com.example.figuras.modelo;

public class Rectangulo extends Figuras {
    public Rectangulo(){
        super(0f, 0f);
    }


    @Override
    public float getBase() {
        return this.getDimensiones()[0];
    }

    @Override
    public float getAltura() {
        return this.getDimensiones()[1];
    }

    @Override
    public Float calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }

    @Override
    public Float calcularPerimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }

    
}
