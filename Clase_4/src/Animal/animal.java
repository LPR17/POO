package Animal;

abstract class animal {
    //Atributos
    //Protected accedemos a la jerarqupie de herencia
    protected String name;
    protected int age;

    //Constructor inicializa la clase - Todos los constructores son public
    public animal(String nameA, int ageB) {
        //Le asignamos a los atributos de la clase los parámetros del constructor
        this.name = nameA;
        this.age = ageB;
    }

    //Métodos
    public void cumpleAnios(){
        this.age++;
    }

    //metodo abstracto entonces tenemos que implementarlo en las subclases
    public abstract void emitirSonido();

    //Sobrecarga de métodos -----------------------------------------------------
    public void dormir(){
        System.out.println(name + " está durmiendo");
    }
    public void dormir(String name){
        System.out.println(name + " está durmiendo");
    }
    //----------------------------------------------------------------------------

    //Sobrecarga de métodos -----------------------------------------------------
    public void comer(){
        System.out.println(name + " está comiendo");
    }

    public void comer(String comida){
        System.out.println(name + " está comiendo " + comida);
    }
    //----------------------------------------------------------------------------


}
