public class AjustesBuilder implements PantallaBuilder {
    private Pantalla pantalla;

    public AjustesBuilder() {
        pantalla = new Pantalla();
    }
        @Override
        public void construirTitulo() {
            pantalla.setTitulo("Ajustes");
        }
        @Override
        public void construirCabecera() {
            pantalla.setCabecera("Configuración de la aplicación");
        }
        @Override
        public void construirContenido() {
            pantalla.setContenido("Idioma - Tema - Notificaciones");
        }
        @Override
        public void construirBotonPrincipal() {
            pantalla.setBotonPrincipal("GUARDAR CAMBIOS");
        }
        @Override
        public Pantalla getPantalla() {
            return pantalla;
    }
}