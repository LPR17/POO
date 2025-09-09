public abstract class animal {
    private String name;
    private int age;

    //Constructor inicializa la clase
    public animal(String nombreA, int edadB) {
        //Le asignamos a los atributos de la clase los parámetros del constructor
        this.name = nombreA;
        this.age = edadB;
    }

    //Métodos
    public void comer(){
        System.out.println("comiendo");
    }

    public void dormir(){
        System.out.println("durmiendo");
    }

    public void cumpleAnios(){
        this.age++;
    }

    public abstract emitirSonido();
}