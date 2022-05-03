public class Ataques {

    public static void main(String[] args) throws InterruptedException{
        TestGwen();
        TestNoir();
    }

    public static void TestMiles() throws InterruptedException{
        Screen screen = new Screen();
        MilesMorales miles = new MilesMorales("Miles Morales","Negro y rojo", "Hombre",
                "Universo Ultimate", "Una araña genéticamente mejorada mordió a Miles, otorgándole habilidades únicas. Sin embargo, a diferencia de Peter, Miles sufrió este accidente con trece años",
                13);
        miles.invisibilidad(screen);
        Thread.sleep(10000);
        miles.explosionEnergia(screen);
        Thread.sleep(10000);
        miles.caerEstilo(screen);
        Thread.sleep(10000);
        miles.veneno(screen);
        Thread.sleep(10000);
        miles.regeneracion(screen);
        Thread.sleep(10000);
    }

    public static void TestGwen(){
        SpiderGwen gwen = new SpiderGwen("Gwen Stacy", "Blanco y rosa", "Mujer",
                "Edge of Spider", "El personaje es una variante de Spider-Man, una versión de universo alternativo de Gwen Stacy. Ella reside en la \"tierra-65\", donde, en lugar de Peter Parker, Gwen Stacy fue mordida por la araña radiactiva, conduciéndola en una carrera como la Spider-Woman de su mundo.",
                15);
        gwen.showMessage();
        gwen.intuicionPolicial();
        gwen.punzada();
        gwen.relojViaje();
        gwen.tocarBateria();
    }

    public static void TestNoir(){
        Screen screen = new Screen();
        Noir noir = new Noir("Peter Parker", "Negro con gris", "Hombre", "Marvel Noir",
                "Spider-Man Noir o simplemente Spider-Man (Peter Parker) es un personaje ficticio, un superhéroe que aparece en cómics estadounidenses publicados por Marvel Comics. Esta versión alternativa de Spider-Man es una versión más oscura de Spider-Man y el mito está ambientado en 1933, durante la Gran Depresión y forma parte del universo de Marvel Noir.",
                28);
        Runnable r = new Runnable() {
            @Override
            public void run(){
                try{
                    screen.out(noir.showMessage(),"Helvetica", 28, Colors.BLUE);
                    Thread.sleep(5000);

                    noir.balanceo(screen);
                    Thread.sleep(5000);

                    noir.lanzarTelaraña(screen);
                    Thread.sleep(5000);

                    noir.sigilo(screen);
                    Thread.sleep(5000);

                    noir.treparMuros(screen);
                    Thread.sleep(5000);
                }catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };
        Thread tr = new Thread(r);
        tr.start();
    }
}


