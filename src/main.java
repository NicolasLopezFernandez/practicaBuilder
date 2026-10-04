public class main {

    //Pregunta: ¿Por qué utilizamos Builder en lugar de crear directamente un objeto Pantalla con un constructor que reciba todos sus atributos? Porque builder nos permite constuir el objeto complejo paso a paso y separar la construcion de la pantalla final

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