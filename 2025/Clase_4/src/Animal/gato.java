package Animal;

//Clase worker gato
class gato extends animal {

    public gato(String name, int age) {
        super(name, age);
    }


    @Override
    public void emitirSonido(){
        System.out.println(name + " dice miau miau");
    }
}
