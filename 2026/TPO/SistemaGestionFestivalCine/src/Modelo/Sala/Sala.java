package Modelo.Sala;

public class Sala {

    //Atributos
    private String  nombre;
    private String ubicacion;
    private int capacidad;
    private List<Butaca> butacas;

    //Constructor
    public Sala (String nombre, String ubicacion, int capacidad) {
        if (nombre == null | nombre.isBlank()){
            throw new DatosInvalidosException("El nombre de la sala no puede estar vacío");
        }




    }
}
