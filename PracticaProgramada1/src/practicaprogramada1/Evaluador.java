/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada1;

/**
 *
 * @author 50672
 */
public class Evaluador {
   
 
    public static int evaluar(String expresion, int index, Pila pila) {

        // Caso base: ya no hay más caracteres por procesar
        if (index >= expresion.length()) {
            return pila.desapilar();
        }

        // Se obtiene el carácter actual
        char actual = expresion.charAt(index);

        // Si el carácter es un espacio, se ignora
        if (actual == ' ') {
            return evaluar(expresion, index + 1, pila);
        }

        // Si el carácter es un número (un solo dígito)
        if (actual >= '0' && actual <= '9') {
            int numero = actual - '0'; // conversión de char a int
            pila.apilar(numero);
            return evaluar(expresion, index + 1, pila);
        }

        // Si el carácter es un operador
        int b = pila.desapilar();
        int a = pila.desapilar();
        int resultado = 0;

        // Se aplica la operación correspondiente
        if (actual == '+') {
            resultado = a + b;
        } else if (actual == '-') {
            resultado = a - b;
        } else if (actual == '*') {
            resultado = a * b;
        } else if (actual == '/') {
            resultado = a / b;
        }

        // El resultado se vuelve a apilar
        pila.apilar(resultado);

        // Llamada recursiva para continuar procesando la expresión
        return evaluar(expresion, index + 1, pila);
    }

    static int evaluar(String exp, int i, Pila p) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

    



