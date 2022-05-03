public class Spiderman {
    private String nombre, colorTraje, genero, origen, descripcion;
    private int edad;
    public Spiderman(String nombre, String colorTraje, String genero, String origen, String descripcion, int edad){
        setNombre(nombre);
        setColorTraje(colorTraje);
        setGenero(genero);
        setOrigen(origen);
        setDescripcion(descripcion);
        setEdad(edad);
    }

    public String getNombre() {  return nombre;  }
    public String getColorTraje() {  return colorTraje;  }
    public String getDescripcion() {  return descripcion;  }
    public String getOrigen() {  return origen;  }
    public String getGenero() {  return genero;  }
    public int getEdad() {  return edad;  }

    public boolean setColorTraje(String colorTraje) {
        if(!colorTraje.isEmpty()){
            this.colorTraje = colorTraje;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setDescripcion(String descripcion) {
        if (!descripcion.isEmpty()) {
            this.descripcion = descripcion;
            return true;
        } else
            return false;
    }

    public boolean setOrigen(String origen) {
        if (!origen.isEmpty()) {
            this.origen = origen;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero) {
        if (!genero.isEmpty()) {
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setEdad(int edad){
        if(edad>0){
            this.edad = edad;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
        "Nombre: "+nombre+"\n"+
                "Color del traje: "+colorTraje+"\n"+
                "Genero: "+genero+"\n"+
                "Origen: "+origen+"\n"+
                "Descripcion: "+descripcion+"\n"+
                "Edad: "+edad;
    }
}
