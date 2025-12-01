package product;

public class ReportePDF extends Reporte {
    @Override
    public void generarContenido(String contenido) {
        this.contenido = "Archivo PDF con cuerpo: " + contenido;
        System.out.println(this.contenido);
    }
}
