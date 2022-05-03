package practicaHarry;

public class PersonajeH {

    private String nombre, casa, genero, boggart, patronus;
    PersonajeH(String nombre, String casa, String genero, String boggart, String patronus){
        this.nombre = nombre;
        this.casa = casa;
        this.genero = genero;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public void show(){
        System.out.println("Se ha creado un persona de la saga Harry Potter con las" +
                " siguientes caracteristicas"+"\n"+
                "Nombre: "+ nombre+"\n"+
                "Casa: "+casa+"\n"+
                "Genero: "+genero+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus);
    }
}
