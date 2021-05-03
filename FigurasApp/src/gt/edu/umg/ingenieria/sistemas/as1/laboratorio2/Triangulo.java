package gt.edu.umg.ingenieria.sistemas.as1.laboratorio2;
import java.util.*;

public class Triangulo extends Figura implements IFigura {

    public Triangulo() {
    }

    private float base;

    private float ladoI;
    private float ladoD;

    public float getBase() {
        // TODO implement here
        return this.base;
    }

    public void setBase(float base) {
        // TODO implement here
        this.base=base;
    }

    public float getLadoI() {
        // TODO implement here
        return this.ladoI;
    }

    public void setLadoI(float ladoI) {
        // TODO implement here
        this.ladoI=ladoI;
    }
    
    public float getLadoD() {
        // TODO implement here
        return this.ladoD;
    }

    public void setLadoD(float ladoD) {
        // TODO implement here
        this.ladoD=ladoD;
    }

    public void calcularArea() {
        // TODO implement here
  
    }

    public void calcularPerimetro() {
        // TODO implement here

    }

    public void dibujar() {
        // TODO implement here

    }

    public void imprimir() {
        // TODO implement here

    }
    
    public void exportarCoordenadas() {
        // TODO implement here
        System.out.println("exportando coordenadas: para triangulo de "
        +ladoI+super.getUnidad()+","+ladoD+super.getUnidad()+","+base+super.getUnidad());
    }

}