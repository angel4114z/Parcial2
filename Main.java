import config.ConfiguracionSistema;
import factory.*;
import product.Reporte;

public class Main {
    public static void main(String[] args) {
        
        // configuración inicial del sistema
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        config.mostrarConfiguracion();
        
        // configuracion modificada
        config.setDirectorioSalida("./mis_reportes/");
        config.setFormatoPorDefecto("excel");
        config.setMostrarMarcaAgua(true);
        
        System.out.println("Configuración modificada:");
        config.mostrarConfiguracion();


        // crear reportes usando la fabrica y el center
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

        // crear reporte usando formato por defecto
        Reporte reportePorDefecto = factory.crearReportePorDefecto();
        reportePorDefecto.generarContenido("Contenido del reporte usando formato por defecto");


        // crear reportes con decoradores
        Reporte reporteDecorado;
        tipo = "pdf";
        contenido = " reporte PDF con decoradores.";
        reporteDecorado = reporteCenter.generarReporte(tipo, contenido);
        reporteDecorado = new decorator.EncabezadoDecorator(reporteDecorado);
        reporteDecorado = new decorator.PieConFechaDecorator(reporteDecorado);
        reporteDecorado = new decorator.MarcaAguaDecorador(reporteDecorado);
        reporteDecorado.generarContenido(contenido);

        // cambiar configuracion de los decoradores
        System.out.println("Deshabilitando marca de agua");
        config.setMostrarMarcaAgua(false);
        
        tipo = "excel";
        contenido = " reporte Excel con decoradores.";
        reporteDecorado = reporteCenter.generarReporte(tipo, contenido);
        reporteDecorado = new decorator.EncabezadoDecorator(reporteDecorado);
        reporteDecorado = new decorator.MarcaAguaDecorador(reporteDecorado);
        reporteDecorado.generarContenido(contenido);
        
        System.out.println("habilitando marca de agua");
        config.setMostrarMarcaAgua(true);
        
        tipo = "html";
        contenido = " reporte HTML con decoradores.";
        reporteDecorado = reporteCenter.generarReporte(tipo, contenido);
        reporteDecorado = new decorator.EncabezadoDecorator(reporteDecorado);
        reporteDecorado = new decorator.PieConFechaDecorator(reporteDecorado);
        reporteDecorado.generarContenido(contenido);
        
    }
}
