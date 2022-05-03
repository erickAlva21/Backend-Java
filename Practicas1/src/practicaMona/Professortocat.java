package practicaMona;

public class Professortocat extends Mona{

    Professortocat(){
        System.out.println("Hola soy Mona, y sor profesora");
    }

    @Override
    public void vestimenta() {
        System.out.println("Traigo unos lentes cirulares, una manazana en la mano derecha y un" +
                " palo de madera en la mano izquierda0");
    }

    @Override
    public void actividad() {
        System.out.println("Estoy dando clase de programación Back End con Java :)");
    }

    @Override
    public void profesion() {
        System.out.println("Soy Ingeniera en Sistemas Computacionales, por eso dooy clases de progrmacion");
    }

    @Override
    public void DondeTrabajo() {
        System.out.println("Trabajo en una escuela pública");
    }

    @Override
    public void salario() {
        System.out.println("Gano mil dolares al mes");
    }
}

class correr{
    public static void main(String[] args) {
        Mona m1 = new Mona(),
                m2 = new Boxertocat(),
                m3 = new Hulatocat(),
                m4 = new Dinotocat(),
                m5 = new Grinchtocat(),
                m6 = new Kimonotocat(),
                m7 = new Professortocat();

        m1.actividad();
        m1.DondeTrabajo();
        m1.herramientas();
        m1.profesion();
        m1.vestimenta();
        m1.salario();

        m2.vestimenta();
        m2.salario();
        m2.profesion();
        m2.herramientas();
        m2.actividad();
        m2.DondeTrabajo();

        m3.actividad();
        m3.profesion();
        m3.vestimenta();
        m3.herramientas();

        m4.vestimenta();
        m4.actividad();

        m5.actividad();
        m5.herramientas();
        m5.profesion();

        m6.vestimenta();
        m6.herramientas();
        m6.actividad();
        m6.DondeTrabajo();

        m7.vestimenta();
        m7.actividad();
        m7.profesion();
        m7.DondeTrabajo();
        m7.salario();
    }
}