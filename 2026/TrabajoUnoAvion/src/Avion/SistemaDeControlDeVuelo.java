package Avion;


//Clase Sistema De Control De Vuelo
public class SistemaDeControlDeVuelo {
    //Atributos
    private String fabricante;
    private int numerosDeModos;
    private TipoDeSistema tipoDeSistema;
    private int modoActuial;


    //Constructor
    public SistemaDeControlDeVuelo(String nombreFabricante, int numerosDeModos, TipoDeSistema tipoDeSistema) {
        this.fabricante = nombreFabricante;
        this.numerosDeModos = numerosDeModos;
        this.tipoDeSistema = tipoDeSistema;
        this.modoActuial = 1;
    }

    //Metodo para cambiar de modos
    public void cambiarDeModo(int nuevoModo){

        //Si el nuevo modo es mayor o igual a 1 y Es menor o igual a la cantidad de modos
        if (nuevoModo >= 1 && nuevoModo <= numerosDeModos) {
            //Entonces este es el modo Actual;
            this.modoActuial = nuevoModo;
            System.out.println("Se cambio al modo: " + modoActuial);

        //Si no lo es
        } else {
            System.out.println("Modo incorrecto - Debe estar entre 1 y " + numerosDeModos);
        }
    }

    //Métodos Getters

    //Devolver el fabricante
    public String getFabricante(){
        return fabricante;
    }

    //Devolver el modo actual
    public int getModoActual(){
        return modoActuial;
    }

    //Devuelve el tipo de sistema del Avion
    public TipoDeSistema getTipoDeSistema(){
        return tipoDeSistema;
    }
}
