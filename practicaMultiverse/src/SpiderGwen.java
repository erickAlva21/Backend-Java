public class SpiderGwen extends Spiderman implements SpiderGwenCallbacks{
    public SpiderGwen(String nombre, String colorTraje, String genero, String origen, String descripcion, int edad) {
        super(nombre, colorTraje, genero, origen, descripcion, edad);
    }

    @Override
    public void intuicionPolicial() {
        System.out.println("Mi papá es policia, por lo tanto yo tengo la capacidad de decifrar los problemas" +
                " y de investigarlos, mejor que mis semejantes");
    }

    @Override
    public void punzada() {
        System.out.println("Aunque tengo el sentido aracnido desarrollado, no es tan bueno como el del resto" +
                " de spideys");
    }

    @Override
    public void relojViaje() {
        System.out.println("Tengo un reloj que me permite viajar entre universos, en este maravilloso Spiderverse");
    }

    @Override
    public void tocarBateria() {
        System.out.println("Además soy una baterista increíble, toco en una banda ");
    }
}
