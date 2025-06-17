package com.example.figuras.controlador;

import org.springframework.web.bind.annotation.RestController;

import com.example.figuras.modelo.Circulo;
import com.example.figuras.modelo.HolaMundo;
import com.example.figuras.modelo.Rectangulo;
import com.example.figuras.modelo.TrianguloRectangulo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {
    @GetMapping("/holamundo")
    public String holamundo(@RequestParam(required = false) String nombre, 
                            @RequestParam(required = false) String apellido) {
        
        HolaMundo saludo = new HolaMundo(nombre, apellido);
        return "<h2>Hola " + saludo.nombre() + " " + saludo.apellido() + ", ¿que figura quieres calcular?</h2>";
    }
    
    @GetMapping("/rectangulo")
    public String rectangulo(@RequestParam String base, 
                            @RequestParam String altura) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setX(Float.parseFloat(base));
        rectangulo.setY(Float.parseFloat(altura));
        return "<h2>Resultados:</h2>" 
               +"<ul>" +
               "<li><b>Área:</b> " + rectangulo.calcularArea() + " cm<sup>2</sup></li>" +
               "<li><b>Perímetro:</b> " + rectangulo.calcularPerimetro() + " cm</li>" +
               "</ul>";
    }

    @GetMapping("/triangulorectangulo")
    public String triangulorectangulo(@RequestParam String base, 
                                    @RequestParam String altura) {
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo();
        trianguloRectangulo.setX(Float.parseFloat(base));
        trianguloRectangulo.setY(Float.parseFloat(altura));
        return "<h2>Resultados:</h2>" 
               +"<ul>" +
               "<li><b>Área:</b> " + trianguloRectangulo.calcularArea() + " cm<sup>2</sup></li>" +
               "<li><b>Perímetro:</b> " + trianguloRectangulo.calcularPerimetro() + " cm</li>" + 
               "<li><b>Hipotenúsa:</b> " + trianguloRectangulo.calcularHipotenusa() + " cm</li>" +
               "</ul>";

    }

    @GetMapping("/circulo")
    public String circulo(@RequestParam String radio) {
        Circulo circulo = new Circulo();
        circulo.setX(Float.parseFloat(radio));
        return "<h2>Resultados:</h2>" 
               +"<ul>" +
               "<li><b>Diametro:</b> " + circulo.calcularDiametro() + " cm</li>" +
               "<li><b>Área:</b> " + circulo.calcularArea() + " cm<sup>2</sup></li>" + 
               "<li><b>Circunferencia:</b> " + circulo.calcularPerimetro() + " cm</li>" +
               "</ul>";

    }
    
    
    
    
}
