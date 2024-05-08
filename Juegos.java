
package com.mycompany.practicapoocasino;
import java.util.Scanner;


public abstract class Juegos {
    
    //Atributos
    protected int intentos;
    protected int saldo = 100;
    protected int valorApuesta = 10000;
    
    //Constructor
    public Juegos() {
        this.intentos = intentos;
        this.saldo = saldo;
    }
    
    //Metodo abstracto jugar
    protected abstract void jugar();
}
