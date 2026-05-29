package EjemploSwing;
//Importamos la biblioteca completa de Swing y la de awt
import javax.swing.*;
import java.awt.*;

public class VentanaSimple {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Primer Swing");

        //Definimos el tamaño de la ventan principal
        ventana.setSize(400, 200);

        /*Definimos que hace cuando en la ventana principal presionamos la x
        JFrame.EXIT_ON_CLOSE es una constante
        de Swing que indica qué debe hacer la aplicación
        cuando el usuario cierra una ventana (JFrame haciendo clic en la X.
        Finaliza completamente la aplicación Java (termina la JVM)
        */
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        JLabel lbl = new JLabel("Bienvenido");
        JButton boton = new JButton("Saludar");
        ventana.add(lbl);
        ventana.add(boton);
        ventana.setVisible(true);

        //Le agregamos la acción y evento al botón
        //Imprime en consola
        boton.addActionListener(e -> {
            System.out.println("Click!");
        });

        //Abre una nueva ventana con un mensaje
        boton.addActionListener(e ->{
            JOptionPane.showMessageDialog(
                    null,
                    "Hola Alumno!"
            );
        });
    }

}
