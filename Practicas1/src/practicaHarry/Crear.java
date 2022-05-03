package practicaHarry;

public class Crear{

    public static void main(String[] args) {
        PersonajeH per1 = new PersonajeH("Harry","Gryffindor", "Masculino",
                "Dementor", "Ciervo"),
                per2 = new PersonajeH("Albus Dumbledore", "Gryffindor","Masculino",
                        "El cuerpo de su hermana Ariana","Fenix"),
                per3 = new PersonajeH("Minerva McGonagall", "Gryffindor", "Femenino",
                        "Lord Voldemort", "Gato"),
                per4 = new PersonajeH("Tom Ryddle","Slytherin", "Masculino",
                        "Su propia muerte", "No tiene"),
                per5 = new PersonajeH("Cho Chang", "Ravenclaw", "Femenino",
                        "Desconocido", "Cisne");
        per1.show();
        per2.show();
        per3.show();
        per4.show();
        per5.show();
    }
}
