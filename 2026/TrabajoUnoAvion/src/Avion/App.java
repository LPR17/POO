package Avion;

public class App {
    public static void main(String[] args) {
        System.out.println("Al muuuundoooo!!");

        //----------------- ALAS ---------------

        Ala alaIzquierda = new Ala(10.5 , "Blanco" , "Aluminio");
        Ala alaDerecha = new Ala(10.5 , "Blanco", "Aluminio");

        alaIzquierda.extenderFlap();
        alaDerecha.extenderFlap();

        System.out.println("Ala izquierda: ");
        System.out.println(alaIzquierda);

        System.out.println();

        System.out.println("Ala derecha:");
        System.out.println(alaDerecha);

        System.out.println("\n====================\n");

        //----------------- Sistema De Control de Vuelo ---------------

        SistemaDeControlDeVuelo sistemaBoeing = new SistemaDeControlDeVuelo("Boeing", 5 , TipoDeSistema.PilotoAutomatico);

        SistemaDeControlDeVuelo sistemaAirbus = new SistemaDeControlDeVuelo("Airbus", 8, TipoDeSistema.Manual);

        //Imprimir la Información de los sistemas
        System.out.println("---Sistema Boeing---");
        System.out.println(sistemaBoeing);

        //Cambiar Modo
        sistemaBoeing.cambiarDeModo(4);

        System.out.println("---Sistema Airbus---");
        System.out.println(sistemaAirbus);


        sistemaAirbus.cambiarDeModo(7);
    }
}