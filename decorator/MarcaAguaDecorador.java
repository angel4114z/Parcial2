package decorator;
import config.ConfiguracionSistema;
import product.Reporte;

public class MarcaAguaDecorador extends ReporteDecorator {

    public MarcaAguaDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generarContenido(String contenido) {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        
        if (config.isMostrarMarcaAgua()) {
            System.out.println("Marca de agua habilitada en configuración");
            String contenidoConMarcaAgua = contenido + " [Marca de Agua]";
            reporte.generarContenido(contenidoConMarcaAgua);
        } else {
            System.out.println("Marca de agua deshabilitada en configuración");
            reporte.generarContenido(contenido);
        }
    }
    
}
