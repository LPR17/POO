public class perro extends animal{

    //Atributos del perro
    private Boolean esAdiestrado;


    public perro(String nombreA, int edadB) {
        super(nombreA, edadB);
    }

    public Boolean esAdiestrado() {
        return esAdiestrado;
    }

    public void traerObjeto(String objeto){
        System.out.println("nos trajo " + objeto);
    }

    //Con el override lo pisamos
    @Override
    public String emitirSonido() {
        return "Guau Guau";
    }


}