package product;

public abstract class Reporte {
    protected String contenido;

    public void generarContenido(String contenido) {
        this.contenido = contenido;
    }
}
