package gt.edu.umg.ingenieria.sistemas.as1.laboratorio2;
import java.util.*;

public class FigurasApp {

    public FigurasApp() {
    }

    private static Cuadrado x=new Cuadrado();
    private static Circulo circulo=new Circulo();
    private static Triangulo triangulo=new Triangulo();

    public static void main(String[] args) {
        // TODO implement here
        circulo.setUnidad("cm");
        circulo.setRadio(25);
        circulo.dibujar();
        System.out.println("==============");
        
        x.setUnidad("cm");
        x.setLongitud(3);
        x.setColorBorde("rojo");
        x.setColorRelleno("azul");
        x.dibujar();
        x.imprimir();
        
        System.out.println("=============");
        triangulo.setUnidad("cm");
        triangulo.setLadoI(100);
        triangulo.setLadoD(25);
        triangulo.setBase(76);
        triangulo.exportarCoordenadas();
        
        
    }

}