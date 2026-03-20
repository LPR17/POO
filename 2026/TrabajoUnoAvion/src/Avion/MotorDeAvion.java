package Avion;

public class MotorDeAvion {
    private String marca;
    private int caballosDeFuerzaEnHP;
    private double empujeEnLibras;
    private boolean motorEncendido;

    public MotorDeAvion(String marca, int caballosDeFuerzaEnHP, double empujeEnLibras){
        this.marca = marca;
        this.caballosDeFuerzaEnHP = caballosDeFuerzaEnHP;
        this.empujeEnLibras = empujeEnLibras;
        motorEncendido = false;
    }

    public void encenderMotor(){
        motorEncendido = true;
    }

    public void apagarMotor(){
        motorEncendido = false;
    }

    public String getMarca(){
        return marca;
    }

    public int getCaballosDeFuerzaEnHP(){
        return caballosDeFuerzaEnHP;
    }

    public double getEmpujeEnLibras(){
        return  empujeEnLibras;
    }

    public boolean isMotorEncendido(){
        return motorEncendido;
    }

    @Override
    public String toString(){
        return "Motor {" +
                "Marca = " + marca + " - " +
                "Caballos de Fuerza (HP) = " + caballosDeFuerzaEnHP + " - " +
                "Empuje en Libras = " + empujeEnLibras + " - " +
                "Motor Encendido = " + motorEncendido +
                "}";
    }

}
