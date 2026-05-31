package Modelo.Persona;

public abstract class Persona {

    //Atributos de las Personas
    protected String dni;
    protected String nombre;
    protected String apellido;


    //Constructor de Persona
    public Persona(String dni, String nombre, String apellido){
        //Validaciones

        //El dni no puede ser nulo o vacío
        if (dni == null || dni.isBlank()){
            throw new DatosInvalidosException("El DNI no puede ser nulo o vacío.");
        }

        //El dni solo pueden ser caracteres numéricos
        if (!dni.matches("\\d+")) {
            throw new DatosInvalidosException("El DNI solo puede contener caracteres numéricos.");
        }

        //El nombre no puede ser nulo o vacío
        if (nombre == null || nombre.isBlank()) {
            throw new DatosInvalidosException("El nombre no puede estar vacío.");
        }

        //El apellido no puede ser nulo o vacío
        if (apellido == null || apellido.isBlank()) {
            throw new DatosInvalidosException("El apellido no puede estar vacío.");
        }

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Metodos

}
