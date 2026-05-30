package Ejercicio2_CalculadoraBasica;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    private JTextField campo1, campo2;
    private JLabel lblResultado;

    public Main(){

        setTitle("Calculadora");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //La ventana principal no es relativa de nadie -> null
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Ingrese un numero"));
        campo1 = new JTextField();
        panel.add(campo1);

        panel.add(new JLabel("Ingrese un numero"));
        campo2 = new JTextField();
        panel.add(campo2);

        //Creamos y agregamos los botones al panel
        JButton botonSuma = new JButton("+");
        panel.add(botonSuma);
        JButton botonResta = new JButton("-");
        panel.add(botonResta);
        JButton botonMultiplicacion = new JButton("*");
        panel.add(botonMultiplicacion);
        JButton botonDivision = new JButton("/");
        panel.add(botonDivision);

        //Creamos y agregamos la etiqueta
        lblResultado = new JLabel("Resultado: ");
        panel.add(lblResultado);

        //Funcionalidades de los botones
        //SUMAR
        botonSuma.addActionListener(e -> calcularSuma());
        //RESTA
        botonResta.addActionListener(e -> calcularResta());
        //MULTIPLICACION
        botonMultiplicacion.addActionListener(e -> calcularMultiplicacion());
        //DIVISION
        botonDivision.addActionListener(e -> calcularDivision());

        add(panel);

    }

    private void calcularSuma(){
        try{
            Double numero1 = Double.parseDouble(campo1.getText());
            Double numero2 = Double.parseDouble(campo2.getText());

            Double suma = numero1 + numero2;
            lblResultado.setText("Resultado: " + suma);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void calcularResta(){
        try{
            Double numero1 = Double.parseDouble(campo1.getText());
            Double numero2 = Double.parseDouble(campo2.getText());

            Double resta = numero1 - numero2;
            lblResultado.setText("Resultado: " + resta);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void calcularMultiplicacion(){
        try{
            Double numero1 = Double.parseDouble(campo1.getText());
            Double numero2 = Double.parseDouble(campo2.getText());

            Double multiplicacion = numero1 * numero2;
            lblResultado.setText("Resultado: " + multiplicacion);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void calcularDivision(){
        try{
            Double numero1 = Double.parseDouble(campo1.getText());
            Double numero2 = Double.parseDouble(campo2.getText());

            Double division = numero1 / numero2;
            lblResultado.setText("Resultado: " + division);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(()-> new Main().setVisible(true));
    }
}
