import factory.ReporteFactory;
import product.*;

public class ReporteCenter {
    ReporteFactory reporteFactory;
    
    public ReporteCenter(ReporteFactory reporteFactory) {
        this.reporteFactory = reporteFactory;
    }

    public Reporte generarReporte(String tipo, String contenido) {
        Reporte reporte = reporteFactory.crearReporte(tipo);
        if (reporte != null) {
            reporte.generarContenido(contenido);
        }
        return reporte;
    }
}
