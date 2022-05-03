package practicaMona;

public class Grinchtocat extends Mona{
    Grinchtocat(){
        System.out.println("Hola soy mona, pero ahora odio la navidad y soy grinch");
    }

    @Override
    public void vestimenta() {
        System.out.println("Estoy vestida de Santa Claus, con una mochila con regalos en el costado" +
                " ademas de tener una esfera en la mano");
    }

    public void colorPiel(){
        System.out.println("Ahora mi piel es color verde y esponjosa como si fuera un peluche :)");
    }

    @Override
    public void actividad() {
        System.out.println("Estoy entrando en una chimenea a una casa para cambiar los regalos de la casa" +
                " por lo mios, ademas de entrar a arruinar la navidad");
    }

    @Override
    public void herramientas() {
        System.out.println("Saco para los regalos");
    }

    @Override
    public void profesion() {
        System.out.println("Mi profesion es sera siempre arruinar la anavidad");
    }
}
