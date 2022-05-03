public class MilesMorales extends Spiderman implements MilesMoralesCallbacks{
    public MilesMorales(String nombre, String colorTraje, String genero, String origen, String descripcion, int edad) {
        super(nombre, colorTraje, genero, origen, descripcion, edad);
    }

    @Override
    public void invisibilidad(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica",28,Colors.BLACK);
        s.out("\n Me puedo camuflar a voluntad!","Helvetica",28,Colors.BLACK);
        s.showImage("camuflaje.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void veneno(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica",28,Colors.BLACK);
        s.out("\n Tambien tengo golpe de veneno!","Helvetica",28,Colors.BLACK);
        s.showImage("veneno.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void caerEstilo(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica",28,Colors.BLACK);
        s.out("\n Me gusta hacer acrobacias en el cielo!","Helvetica",28,Colors.BLACK);
        s.showImage("saltar.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void regeneracion(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica",28,Colors.BLACK);
        s.out("\n Me regenero más rapido que todos mis similares!","Helvetica",28,Colors.BLACK);
        s.showImage("regeneracion.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void explosionEnergia(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica",28,Colors.BLACK);
        s.out("\n Tengo la habilidad de mandar una explosion de desacraga!","Helvetica",28,Colors.BLACK);
        s.showImage("explosion.jpg");
        s.setBounds(200,100,1100,900);
    }
}
