package Avion;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Ala alaIzquierda = new Ala(10.5 , "Blanco" , "Aluminio");
        Ala alaDerecha = new Ala(10.5 , "Blanco", "Aluminio");

        alaIzquierda.extenderFlap();
        alaDerecha.extenderFlap();

        System.out.println("Ala izquierda: ");
        System.out.println(alaIzquierda);

        System.out.println();

        System.out.println("Ala derecha:");
        System.out.println(alaDerecha);
    }

}