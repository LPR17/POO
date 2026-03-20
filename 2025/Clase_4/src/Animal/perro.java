package Animal;

//Clase worker perro
class perro extends animal {

    public perro(String name, int age) {
        super(name, age);
    }

    @Override
    public void emitirSonido(){
        System.out.println(name + " dice guau guau");
    }
}
