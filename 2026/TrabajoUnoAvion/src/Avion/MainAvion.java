package Avion;

public class MainAvion {

    public static void main(String[] args) {

        //---- Creacion de Partes ----

        //ALAS
        Ala alaIzquierda = new Ala(10.5 , "Blanco" , "Aluminio");
        Ala alaDerecha = new Ala(10.5 , "Blanco", "Aluminio");

        Ala[] alas = {alaIzquierda, alaDerecha};

        //MOTOR
        MotorDeAvion motorBoeing = new MotorDeAvion("Rolls Royce", 50000, 70000);

        //SISTEMA DE CONTROL DE VUELO
        SistemaDeControlDeVuelo sistemaBoeing = new SistemaDeControlDeVuelo("Boeing", 5 , TipoDeSistema.PilotoAutomatico);

        //---- Ensamblado de Avion ----

        Avion flybondi = new Avion(
                "Boeing",
                "737",
                180,
                true,
                motorBoeing,
                sistemaBoeing,
                alas
        );

        //Imprimimos el Avion
        System.out.println("Flybondi \n" + flybondi.toString());
    }

}
