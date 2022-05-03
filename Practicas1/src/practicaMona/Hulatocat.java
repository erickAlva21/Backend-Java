package practicaMona;

public class Hulatocat extends Mona{

    Hulatocat(){
        System.out.println("Hola soy Mona, pero ahora soy Hawaiana");
    }

    @Override
    public void profesion() {
        System.out.println("Soy bailarina y musica de la cultura hawaina");
    }

    @Override
    public void vestimenta() {
        System.out.println("Traigo una falda hawaiana, un brasier hecho de cocos y una flor en la cabeza");
    }

    @Override
    public void herramientas() {
        System.out.println("Para trabajar solo necesito un ukulele");
    }

    @Override
    public void actividad() {
        System.out.println("Estoy tocando el ukulele y bailando al mismo tiempo");
    }
}
