package factory;
import config.ConfiguracionSistema;
import product.*;

public class ReporteFactory {
    public Reporte crearReporte(String tipo) {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("Creando archivo usando directorio: " + config.getDirectorioSalida());
        
        Reporte reporte = null;
        switch (tipo.toLowerCase()) {
            case "pdf":
                reporte = new ReportePDF();
                break;
            case "excel":
                reporte = new ReporteExcel();
                break;
            case "html":
                reporte = new ReporteHTML();
                break;
        }
        return reporte;
    }
    
    public Reporte crearReportePorDefecto() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        String formatoDefecto = config.getFormatoPorDefecto();
        System.out.println("Creando reporte con formato por defecto: " + formatoDefecto);
        return crearReporte(formatoDefecto);
    }
}
