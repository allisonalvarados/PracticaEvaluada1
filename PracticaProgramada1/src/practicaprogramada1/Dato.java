/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada1;

/**
 *
 * @author 50672
 */
public class Dato {
    
    private int valor;
    private Dato siguiente;

    public Dato(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public Dato getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Dato siguiente) {
        this.siguiente = siguiente;
    }
}


