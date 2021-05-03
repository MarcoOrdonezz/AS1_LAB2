package gt.edu.umg.ingenieria.sistemas.as1.laboratorio2;
import java.util.*;

public class Cuadrado extends Figura implements IFigura {


    private float longitud;


    public float getLongitud() {
        // TODO implement here
        return this.longitud;
    }

    public void setLongitud(float longitud) {
        // TODO implement here
        this.longitud=longitud;

    }
    
    public void calcularArea() {
        
    }

    public void calcularPerimetro() {

    }

    public void dibujar() {
        System.out.println("dibujando cuadrado");
        System.out.println("longitud:"+longitud+""+super.getUnidad()+" borde:"+super.getColorBorde()+" fondo:"+super.getColorRelleno());
    }

    public void imprimir() {
        System.out.println("imprimiendo cuadrado");
        System.out.println("longitud:"+longitud+""+super.getUnidad()+" borde:"+super.getColorBorde()+" fondo:"+super.getColorRelleno());

    }

    public void exportarCoordenadas() {
       
    }




}