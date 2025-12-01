package product;

public class ReporteExcel extends Reporte {
    @Override
    public void generarContenido(String contenido) {
        this.contenido = "Archivo Excel con cuerpo: " + contenido;
        System.out.println(this.contenido);
    }   
}
