package decorator;

import config.ConfiguracionSistema;
import product.Reporte;

public class PieConFechaDecorator extends ReporteDecorator {

    public PieConFechaDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generarContenido(String contenido) {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("Formato por defecto: " + config.getFormatoPorDefecto());
        
        String contenidoConPie = contenido + " [Pie con Fecha: 2025-12-01]";
        reporte.generarContenido(contenidoConPie);
    }
    
}
