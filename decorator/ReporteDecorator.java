package decorator;
import product.*;

public abstract class ReporteDecorator extends Reporte {
    Reporte reporte;

    public ReporteDecorator(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public abstract void generarContenido(String contenido);
    
}
