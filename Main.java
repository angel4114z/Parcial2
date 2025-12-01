import factory.*;

public class Main {
    public static void main(String[] args) {

        // Crear y generar un reporte PDF
        ReporteFactory factory = new ReporteFactory();
        ReporteCenter reporteCenter = new ReporteCenter(factory);

        String tipo;
        String contenido;

        tipo = "pdf";
        contenido = "Este es el contenido del reporte PDF.";
        reporteCenter.generarReporte(tipo, contenido);
        tipo = "excel";
        contenido = "Este es el contenido del reporte Excel.";
        reporteCenter.generarReporte(tipo, contenido);
        tipo = "html";
        contenido = "Este es el contenido del reporte HTML.";
        reporteCenter.generarReporte(tipo, contenido);
        
    }
}
