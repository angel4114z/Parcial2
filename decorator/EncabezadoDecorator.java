package decorator;
import config.ConfiguracionSistema;
import product.Reporte;

public class EncabezadoDecorator extends ReporteDecorator {

    public EncabezadoDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generarContenido(String contenido) {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("Directorio configurado: " + config.getDirectorioSalida());
        
        String contenidoConEncabezado = "Encabezado: " + contenido;
        reporte.generarContenido(contenidoConEncabezado);
    }
}