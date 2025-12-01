package product;

public class ReporteHTML extends Reporte {
    @Override
    public void generarContenido(String contenido) {
        this.contenido = "Archivo HTML con cuerpo: " + contenido;
        System.out.println(this.contenido);
    }
    
}
