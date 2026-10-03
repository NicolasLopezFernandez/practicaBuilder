public interface PantallaBuilder {
    void construirTitulo();
    void construirCabecera();
    void construirContenido();
    void construirBotonPrincipal();
    Pantalla getPantalla();
}