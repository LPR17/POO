package PlantaNuclear;

public interface Controlable {

    void encender();
    void apagar();
    void scram(); //Parada de emergencia del reactor
    boolean estaEncendido();

}
