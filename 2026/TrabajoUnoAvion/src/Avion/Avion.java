package Avion;

public class Avion {

    //Atributos
    private String marca;
    private String modelo;
    private int numeroAsientos;
    private boolean sistemaEntretenimiento;

    private MotorDeAvion motor;
    private SistemaDeControlDeVuelo sistemaDeControl;

    //Como son 2 o más alas utilizamos un arreglo (o lista)
    private Ala[] alas;

    //Constructor del Avion
    public Avion(String marcaAvion,
                 String modeloAvion,
                 int numeroAsientosAvion,
                 boolean tieneSistemaDeEntretenimiento,
                 MotorDeAvion motor,
                 SistemaDeControlDeVuelo sistemaDeControl,
                 Ala[] alas)
    {
        this.marca = marcaAvion;
        this.modelo = modeloAvion;
        this.numeroAsientos = numeroAsientosAvion;
        this.sistemaEntretenimiento = tieneSistemaDeEntretenimiento;
        this.motor = motor;
        this.sistemaDeControl = sistemaDeControl;
        this.alas = alas;
    }

    //Getters Avion
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getNumeroAsientos(){
        return numeroAsientos;
    }

    public boolean isSistemaEntretenimiento(){
        return sistemaEntretenimiento;
    }

    public MotorDeAvion getMotor() {
        return motor;
    }

    public SistemaDeControlDeVuelo getSistemaDeControl() {
        return sistemaDeControl;
    }

    public Ala[] getAlas() {
        return alas;
    }


    @Override
    public String toString(){
        return "Avion {" +
                "Marca = '" + marca+"' - " +
                "Modelo = '" + modelo + "' - " +
                "Numero de Asientos = '" + numeroAsientos + "' - " +
                "Sistema Entretenimiento = '" + sistemaEntretenimiento + "' - " +
                "Motor = '" + motor + "' - " +
                "Sistema de Control = '" + sistemaDeControl + "' - " +
                "Cantidad de alas = '" + alas.length +
                "}";

    }
}
