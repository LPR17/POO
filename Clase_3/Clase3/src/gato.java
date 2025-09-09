public class gato extends animal {

    public perro(String nombreA, int edadB) {
        super(nombreA, edadB);
    }

    public void rasguniar(String objetoQueRompen){
        System.out.println(getNombre() + "Esta rompiendo " + objetoQueRompen);
    }

    @Override
    public String emitirSonido(){
        return "Miau";
    }


}
