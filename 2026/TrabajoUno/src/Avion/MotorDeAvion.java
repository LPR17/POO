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
        if (!motorEncendido){
            motorEncendido = true;
            System.out.println("Motor encendido");
        } else {
            System.out.println("El motor ya esta encendido");
        }
    }

    public void apagarMotor(){
        if (motorEncendido){
            motorEncendido = false;
            System.out.println("Motor Apagado");
        } else {
            System.out.println("El motor ya esta apagado");
        }
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
        return "\n\t\t\t{Marca = " + marca +
                "\n\t\t\tCaballos de Fuerza (HP) = " + caballosDeFuerzaEnHP +
                "\n\t\t\tEmpuje en Libras = " + empujeEnLibras +
                "\n\t\t\tMotor Encendido = " + motorEncendido +
                "}";
    }

}
