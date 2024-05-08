
package com.mycompany.practicapoocasino;
import java.util.Scanner;


public class JuegoAdivinarNumero extends Juegos{ 
    
    //Atrubutos
    private int numeroAleatorio;
    private Scanner scanner;
    
    //Constructor
    public JuegoAdivinarNumero() {
        this.numeroAleatorio = (int) (Math.random() * 100) + 1;
        this.scanner = new Scanner(System.in);
        super.intentos = 0;
        super.saldo = 0;

    }
    
    //Metodo abstracto jugar heredado de la clase abstracta Juegos
    @Override
    protected void jugar() {
        
        System.out.println("-------JUEGO ADIVINA EL NUMERO-------");
        System.out.print("Introduce el valor que vas a apostar: ");
        valorApuesta = scanner.nextInt();
        System.out.println("Estoy pensando en un número entre 1 y 100.");

        while (true) {
            System.out.print("Introduce tu adivinanza: ");
            int adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
                if (intentos >= 5){
                    
                    saldo -=  valorApuesta;
                    System.out.println("PERDISTE: " + valorApuesta);
                    //System.out.println("SALDO FINAL: " + saldo);
                }
                else {
                    
                    if (intentos < 5){
                        
                        saldo += valorApuesta * 2;
                        System.out.println("GANASTE: " + valorApuesta*2);
                        System.out.println("SALDO FINAL: " + saldo);
                    }
                }
                break;
            } else if (adivinanza < numeroAleatorio) {
                System.out.println("El número que estoy pensando es mayor que " + adivinanza + ".");
            } else {
                System.out.println("El número que estoy pensando es menor que " + adivinanza + ".");
            }
        }
        intentos = 0;
    }
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
