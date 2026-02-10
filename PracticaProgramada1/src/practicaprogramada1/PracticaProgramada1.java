/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprogramada1;

import javax.swing.JOptionPane;

/**
 *
 * @author 50672
 */
public class PracticaProgramada1 {



    public static void main(String[] args) {

        String exp = "";
        int res = 0;

        try {

            // pedir la expresion al usuario
            exp = JOptionPane.showInputDialog("Digite la expresion postfija");

            // validacion basica
            if (exp == null) {
                JOptionPane.showMessageDialog(null, "No se ingreso nada");
            } else {

                Pila p = new Pila();

                // se llama al evaluador
                res = Evaluador.evaluar(exp, 0, p);

                // mostrar resultado
                JOptionPane.showMessageDialog(null, "Resultado: " + res);
            }

        } catch (Exception e) {
            // si pasa algo raro
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}

    
    

