public class Pantalla {

    private String titulo;
    private String cabezera;
    private String contenido;
    private String botonPrincipal;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setCabezera (String cabezera) {
        this.cabezera = cabezera;
    }
    public void setContenido (String contenido) {
        this.contenido = contenido;
    }
    public void setBotonPrincipal (String botonPrincipal) {
        this.botonPrincipal = botonPrincipal;
    }
    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Cabezera: " + cabezera);
        System.out.println("Contenido: " + contenido);
        System.out.println("Boton Principal: " + botonPrincipal);
    }
}
