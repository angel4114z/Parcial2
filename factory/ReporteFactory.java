package factory;
import product.*;

public class ReporteFactory {
    public Reporte crearReporte(String tipo) {
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
}
