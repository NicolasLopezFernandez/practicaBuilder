public class main {

    public static void main(String[] args) {

        PantallaBuilder perfilBuilder = new PerfilBuilder();

        DirectorPantalla director = new DirectorPantalla(perfilBuilder);

        director.construirPantalla();

        Pantalla pantallaPerfil = perfilBuilder.getPantalla();

        pantallaPerfil.mostrar();


        PantallaBuilder ajustesBuilder = new AjustesBuilder();

        director = new DirectorPantalla(ajustesBuilder);

        director.construirPantalla();

        Pantalla pantallaAjustes = ajustesBuilder.getPantalla();

        pantallaAjustes.mostrar();
    }
}