package practicaMona;

public class Boxertocat extends Mona{

    Boxertocat(){
        System.out.println("Hola soy Mona, pero ahora soy boxeadora");
    }

    @Override
    public void profesion() {
        System.out.println("Soy peleadora profesional");
    }

    @Override
    public void actividad() {
        System.out.println("Ahora mismo estoy peleando en una competecia de Box");
    }

    @Override
    public void DondeTrabajo() {
        System.out.println("Soy peleadora profesional en una academia de boxeo");
    }

    @Override
    public void herramientas() {
        System.out.println("Mi herramienta de trabajo son unos guantes y en ocasiones careta");
    }

    @Override
    public void vestimenta() {
        System.out.println("Tengo unos guantes de box rojos y una banda roja en la cabeza ");
    }

    @Override
    public void salario() {
        System.out.println("Gano por competencia");
    }
}
