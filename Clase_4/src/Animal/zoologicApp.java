package Animal;

import java.util.ArrayList;

public class zoologicApp {

    public static void main(String[] args) {
        //Tipo de dato un array list que dentro contiene animales. Definimos un array vacío
        ArrayList<animal> animals = new ArrayList<animal>();


        //agregamos elementos al arreglo
        animals.add(new gato("Lautaro", 3));
        animals.add(new gato("Giuli", 2));
        animals.add(new gato("Gio", 4));

        animals.add(new perro("Jazmin", 10));
        animals.add(new perro("Mulan", 9));

        animals.add(new pajaro("Caniggia" , 56));

        for(animal objeto: animals){

            objeto.comer();
            objeto.comer("galletitas");
            objeto.dormir();
            objeto.emitirSonido();

            System.out.println("---- Fin ----");

        }

    }
}
