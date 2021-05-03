package gt.edu.umg.ingenieria.sistemas.as1.laboratorio2;

import java.util.*;

public class Circulo extends Figura implements IFigura {

    public Circulo() {
    }

    private int radio;

    public int getRadio() {
        // TODO implement here
        return this.radio;
    }

    public void setRadio(int radio) {
        // TODO implement here
        this.radio=radio;
    }

    public void calcularArea() {
        // TODO implement here
    
    }

    public void calcularPerimetro() {
        // TODO implement here

    }

    public void dibujar() {
        // TODO implement here
         System.out.println("dibujando circulo radio:"+radio+""+super.getUnidad()); 
    }

    public void imprimir() {

    }
    
    public void exportarCoordenadas() {
       
    }

}