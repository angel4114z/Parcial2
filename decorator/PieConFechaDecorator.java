package decorator;

import product.Reporte;

public class PieConFechaDecorator extends ReporteDecorator {

    public PieConFechaDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generarContenido(String contenido) {
        String contenidoConPie = contenido + " [Pie con Fecha: 2025-12-01]";
        reporte.generarContenido(contenidoConPie);
    }
    
}
