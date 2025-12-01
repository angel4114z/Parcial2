import factory.*;
import product.Reporte;

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

        Reporte reporteDecorado;
        tipo = "pdf";
        contenido = " reporte PDF con decoradores.";
        reporteDecorado = reporteCenter.generarReporte(tipo, contenido);
        reporteDecorado = new decorator.EncabezadoDecorator(reporteDecorado);
        reporteDecorado = new decorator.PieConFechaDecorator(reporteDecorado);
        reporteDecorado = new decorator.MarcaAguaDecorador(reporteDecorado);
        reporteDecorado.generarContenido(contenido);
        tipo = "excel";
        contenido = " reporte Excel con decoradores.";
        reporteDecorado = reporteCenter.generarReporte(tipo, contenido);
        reporteDecorado = new decorator.EncabezadoDecorator(reporteDecorado);
        reporteDecorado = new decorator.MarcaAguaDecorador(reporteDecorado);
        reporteDecorado.generarContenido(contenido);
        tipo = "html";
        contenido = " reporte HTML con decoradores.";
        reporteDecorado = reporteCenter.generarReporte(tipo, contenido);
        reporteDecorado = new decorator.EncabezadoDecorator(reporteDecorado);
        reporteDecorado = new decorator.PieConFechaDecorator(reporteDecorado);
        reporteDecorado.generarContenido(contenido);
    }
}
