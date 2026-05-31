package Modelo.Entrada;

import java.time.LocalDateTime;

public abstract class Entrada {

    //Atributos Entradas
    protected String codigo;
    protected LocalDateTime fechaCompra;
    protected double precio;
    protected boolean validada; //Se marca como true cuando se valida en la puerta

    //Relaciones Entradas
    protected Espectador espectador;
    protected Funcion funcion;
    protected Butaca butaca;

    //Constructor Entradas
    public Entrada(String codigo, double precio, Espectador espectador, Funcion funcion, Butaca butaca){

        if (codigo == null || codigo.isBlank()){
            throw new DatosInvalidosException("El codigo de la entrada no puede estar vacío");
        }
        if (precio < 0){
            throw new DatosInvalidosException("El precio de la entrada no puede ser negativo");
        }
        if (espectador == null){
            throw new DatosInvalidosException("La entrada debe tener un espectador asociado");
        }
        if (funcion == null){
            throw new DatosInvalidosException("La entrada debe tener una función asociada");
        }
        if (butaca == null){
            throw new DatosInvalidosException("La entrada debe tener una butaca asociada");
        }

        this.codigo = codigo;
        this.precio = precio;
        this.espectador = espectador;
        this.funcion =  funcion;
        this.butaca = butaca;
        this.fechaCompra = LocalDateTime.now();
        this.validada = false;
    }

    //Metodos abstractos
    /*
    * Genera el comprobante de la entrada en el formato propio de cada subclase.
    * - EntradaQR: genera un código QR con URL de validación.
    * - EntradaFisica: genera un ticket impreso con número de serie.
    */
    public abstract String generarComprobante();

    /*
    * Valida la entrada al ingresar a la función.
    * Cada subclase implementa su propio mecanismo de validación.
    * Marca la entrada como "usada" si la validación es exitosa.
    */
    public abstract void validar();



}
