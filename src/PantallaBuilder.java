public interface PantallaBuilder {
    void setTitulo(String titulo);
    void setCabezera(String cabezera);
    void setContenido(String contenido);
    void setBotonPrincipal(String botonPrincipal);
    Pantalla getPantalla();
}