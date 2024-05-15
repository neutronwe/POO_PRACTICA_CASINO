
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
        
        System.out.println("                                                     ");
        System.out.println(" ------------JUEGO ADIVINA EL NUMERO----------------" );
        System.out.println("|                                                   |");
        System.out.print  ("| INGRESA EL VALOR PARA APOSTAR: ");
        valorApuesta = scanner.nextInt();
        System.out.println(" --------------------------------------------------- "); 
        
        System.out.println("                                                     ");
        System.out.println(" --------------------------------------------------- ");  
        System.out.println("|                                                   |");
        System.out.println("| Estoy pensando en un numero entre 1 y 100         |");
        
        while (true) {
            System.out.println("|                                                   |");
            System.out.print  ("| INGRESA UN NUMERO: ");
            int adivinanza = scanner.nextInt();
            System.out.println(" --------------------------------------------------- "); 
            intentos++;

            if (adivinanza == numeroAleatorio) {
                System.out.println("                                                     ");
                System.out.println(" --------------------------------------------------- "); 
                System.out.println("| Has adivinado el número en " + intentos + " intentos");
                System.out.println("|                                                   |");
                System.out.println("| Recuerda que mayor a 5 intentos pierdes           |");
                System.out.println("| todo lo apostado de lo contrario ganas el doble   |");
                System.out.println(" --------------------------------------------------- "); 
                if (intentos >= 5){
                    
                    saldo -=  valorApuesta;
                    System.out.println("                                                     ");
                    System.out.println(" --------------------------------------------------- "); 
                    System.out.println("| PERDISTE: " + valorApuesta);
                    System.out.println(" --------------------------------------------------- "); 
                    //System.out.println("SALDO FINAL: " + saldo);
                }
                else {
                    
                    if (intentos < 5){
                        
                        saldo += valorApuesta * 2;
                        System.out.println("                                                     ");
                        System.out.println(" --------------------------------------------------- "); 
                        System.out.println("GANASTE: " + valorApuesta*2);
                        System.out.println(" --------------------------------------------------- ");
                        //System.out.println("SALDO FINAL: " + saldo);
                    }
                }
                break;
            } else if (adivinanza < numeroAleatorio) {
                System.out.println("                                                     ");
                System.out.println(" --------------------------------------------------- ");
                System.out.println("|                                                   |");
                System.out.println("| El numero que estoy pensando es mayor que " + adivinanza + ".");
                System.out.println(" --------------------------------------------------- ");
                
            } else {
                System.out.println("                                                     ");
                System.out.println(" --------------------------------------------------- ");
                System.out.println("|                                                   |");
                System.out.println("| El numero que estoy pensando es menor que " + adivinanza + ".");
                System.out.println(" --------------------------------------------------- ");
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
