package config;


public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;
    
    private String directorioSalida;
    private String formatoPorDefecto;
    private boolean mostrarMarcaAgua;
    
    private ConfiguracionSistema() {
        this.directorioSalida = "./reportes/";
        this.formatoPorDefecto = "pdf";
        this.mostrarMarcaAgua = true;
    }
    
    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }
    
    public String getDirectorioSalida() {
        return directorioSalida;
    }
    
    public void setDirectorioSalida(String directorioSalida) {
        this.directorioSalida = directorioSalida;
    }
    
    public String getFormatoPorDefecto() {
        return formatoPorDefecto;
    }
    
    public void setFormatoPorDefecto(String formatoPorDefecto) {
        this.formatoPorDefecto = formatoPorDefecto;
    }
    
    public boolean isMostrarMarcaAgua() {
        return mostrarMarcaAgua;
    }
    
    public void setMostrarMarcaAgua(boolean mostrarMarcaAgua) {
        this.mostrarMarcaAgua = mostrarMarcaAgua;
    }
    
    public void mostrarConfiguracion() {
        System.out.println("Directorio de salida: " + directorioSalida);
        System.out.println("Formato por defecto: " + formatoPorDefecto);
        System.out.println("Mostrar marca de agua: " + mostrarMarcaAgua);
    }
}
