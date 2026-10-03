public class Pantalla {

    private String titulo;
    private String cabecera;
    private String contenido;
    private String botonPrincipal;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setCabecera (String cabecera) {
        this.cabecera = cabecera;
    }
    public void setContenido (String contenido) {
        this.contenido = contenido;
    }
    public void setBotonPrincipal (String botonPrincipal) {
        this.botonPrincipal = botonPrincipal;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getCabecera() {
        return cabecera;
    }
    public String getContenido() {
        return contenido;
    }
    public String getBotonPrincipal() {
        return botonPrincipal;
    }
    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Cabecera: " + cabecera);
        System.out.println("Contenido: " + contenido);
        System.out.println("Boton Principal: " + botonPrincipal);
    }
}
