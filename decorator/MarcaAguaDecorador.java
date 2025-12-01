package decorator;
import product.Reporte;
public class MarcaAguaDecorador extends ReporteDecorator {

    public MarcaAguaDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generarContenido(String contenido) {
        String contenidoConMarcaAgua = contenido + " [Marca de Agua]";
        reporte.generarContenido(contenidoConMarcaAgua);
    }
    
}
