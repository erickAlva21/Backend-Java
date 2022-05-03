package practicaMona;

public class Dinotocat extends Mona{

    Dinotocat(){
        System.out.println("Soy Mona pero ahora me converti en dinosaurio, aghhhh");
    }

    @Override
    public void vestimenta() {
        System.out.println("Estoy disfrazada con un traje de dinosaurio");
    }

    @Override
    public void actividad() {
        System.out.println("Estoy parada en una pierna jugando con un carrito a control remoto" +
                " que esta debajo de mi");
    }

}
