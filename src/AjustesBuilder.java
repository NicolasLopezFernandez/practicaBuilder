abstract class AjustesBuilder implements PantallaBuilder {
    private Pantalla pantalla;

    public AjustesBuilder() {
        pantalla = new Pantalla();

        @Override
        public void construirtitulo() {
            pantalla.setTitulo("Ajustes");
        }
        @Override
        public void construirCabezera() {
            pantalla.setCabezera("Configuración de la aplicación");
        }
        @Override
        public void construirContenido() {
            pantalla.setContenido("Idioma - Tema - Notificaciones");
        }
        @Override
        public void construirBotonPrincipal() {
            pantalla.setBotonPrincipal("GUARDAR CAMBIOS");
        }
    }
}