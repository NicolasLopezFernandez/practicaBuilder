abstract class PerfilBuilder implements PantallaBuilder {
    private Pantalla pantalla;

    public PerfilBuilder() {
        pantalla = new Pantalla();

        @Override
        public void construirTitulo() {
            pantalla.setTitulo("Mi Perfil");
        }
        @Override
        public void construirCabezera() {
            pantalla.setCabezera("Datos del usuario");
        }
        @Override
        public void construirContenido() {
            pantalla.setContenido("Nombre - Email - Fotografia");
        }
        @Override
        public void construirBotonPrincipal() {
            pantalla.setBotonPrincipal("EDITAR PERFIL");
        }
    }
}