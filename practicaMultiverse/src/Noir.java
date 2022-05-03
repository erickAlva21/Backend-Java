public class Noir extends Spiderman implements SpiderNoirCallbacks{
    public Noir(String nombre, String colorTraje, String genero, String origen, String descripcion, int edad) {
        super(nombre, colorTraje, genero, origen, descripcion, edad);
    }

    @Override
    public void sigilo(Screen s) {
        s.setVisible(true);
        s.out("Gracias a mi traje color negro, me sigilo en las sombras muy bien \n", "Helvetica", 28, Colors.blue);
    }

    @Override
    public void treparMuros(Screen s) {
        s.setVisible(true);
        s.out("Tengo la habalidad de trepar muros de una manera muy silenciaosa y precavida \n", "Helvetica", 28, Colors.blue);
    }

    @Override
    public void balanceo(Screen s) {
        s.setVisible(true);
        s.out("Mis balanceos son muy elegantes y cuidadosos, ya que debo mantener el sigilo en todo momento \n", "Helvetica", 28, Colors.blue);

    }

    @Override
    public void lanzarTelaraña(Screen s) {
        s.setVisible(true);
        s.out("Mis telerañas son de color negro para manetener la elegancia y el sigilo \n", "Helvetica", 28, Colors.blue);
    }
}
