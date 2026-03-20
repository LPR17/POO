package Animal;

//Clase worker pajaro
class pajaro extends animal {

    public pajaro(String name, int age) {
        super(name, age);
    }


    @Override
    public void emitirSonido(){
        System.out.println(name + " dice pio pio");
    }
}
