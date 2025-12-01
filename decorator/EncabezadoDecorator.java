package decorator;
import product.Reporte;

public class EncabezadoDecorator extends ReporteDecorator {

    public EncabezadoDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generarContenido(String contenido) {
        String contenidoConEncabezado = "Encabezado: " + contenido;
        reporte.generarContenido(contenidoConEncabezado);
    }
}