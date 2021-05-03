package gt.edu.umg.ingenieria.sistemas.as1.laboratorio2;
import java.util.*;

public abstract class Figura {

    public Figura() {
    }

    private String colorBorde;

    private String colorRelleno;

    private String unidad;

    public String getColorBorde() {
        // TODO implement here
        return this.colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        // TODO implement here
        this.colorBorde=colorBorde;
    }

    public String getColorRelleno() {
        // TODO implement here
        return this.colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        // TODO implement here
        this.colorRelleno=colorRelleno;
    }

    public String getUnidad() {
        // TODO implement here
        return this.unidad;
    }

    public void setUnidad(String unidad) {
        // TODO implement here
       this.unidad=unidad;
    }

}