package practicaMona;

public class Kimonotocat extends Mona{

    Kimonotocat(){
        System.out.println("Hola soy Mona Japonesa, me gusta mucho mi cultura");
    }

    @Override
    public void vestimenta() {
        System.out.println("Traigo un kimono morado muy bonito, en la mano derecha traigo un abanico" +
                " morado con muchos kanjis escritos, traigo un conturon rojo, con una bandita donde" +
                " esta amarrado un paraguas rojo que esta detras de mí, en la mano izquierda empuño una katana" +
                " por último traigo una flor morada en el cabello");
    }

    @Override
    public void herramientas() {
        System.out.println("Traigo una katana y un abanico como herramientas de trabajo para exhibicion" +
                " o defensa");
    }

    @Override
    public void actividad() {
        System.out.println("Estoy para con los brazos extendidos con el abanico y la katana en las manos" +
                " estoy concentranda y meditando");
    }

    @Override
    public void DondeTrabajo() {
        System.out.println("Me gusta dar exhibiciones donde recibo dinero en ocasiones");
    }
}
