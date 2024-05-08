
package com.mycompany.practicapoocasino;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        JuegoAdivinarNumero juegoAdivinarNumero = new JuegoAdivinarNumero();
        JuegoAhorcado juegoAhorcado = new JuegoAhorcado();

        while (true) {
            System.out.println("--------INICIO CASINO--------");
            
            int aux = juegoAdivinarNumero.getSaldo();
            int aux2 = juegoAhorcado.getSaldo();
            
            if (aux == 0 || aux2 == 0){
                
                System.out.print("Ingresa el saldo para jugar: ");
          
                juegoAdivinarNumero.setSaldo(scanner.nextInt());
                juegoAhorcado.setSaldo(juegoAdivinarNumero.getSaldo());
            }
            
            
            System.out.println("                                 ");
            System.out.println("SU SALDO ES: " + juegoAdivinarNumero.getSaldo());
            System.out.println("                                          ");
            System.out.println("1. Juego Adivina el número");
            System.out.println("2. Juego El Ahorcado");
            System.out.println("3. Salir");
            System.out.println("                                   ");
            System.out.print("Digite el numero de la opcion: ");
            System.out.println("                                 ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()
            
            

            switch (opcion) {
                case 1:
                    
                    juegoAdivinarNumero.setSaldo(juegoAhorcado.getSaldo());
                    juegoAdivinarNumero.jugar();
                    System.out.println("SALDO FINAL: " + juegoAdivinarNumero.getSaldo());
                    
                    System.out.println("1. Volver a jugar");
                    System.out.println("2. Volver al incio");
                    System.out.println("Digite el numero de la opcion?");
                    int volver = scanner.nextInt();
                    if (volver == 1){
                        
                        while(volver == 1){
                            
                            juegoAdivinarNumero.jugar();
                            System.out.println("SALDO FINAL: " + juegoAdivinarNumero.getSaldo());
                            
                            System.out.println("1. Volver a jugar");
                            System.out.println("2. Volver al incio");
                            System.out.println("Digite el numero de la opcion?");
                            volver = scanner.nextInt();
                        }
                    }
                    
                    else {
                        
                        break;
                    }
                   
                    juegoAhorcado.setSaldo(juegoAdivinarNumero.getSaldo());
                    break;
                    
                case 2:
                    
                    juegoAhorcado.setSaldo(juegoAdivinarNumero.getSaldo());
                  
                    juegoAhorcado.jugar();
                    System.out.println("SALDO FINAL: " + juegoAhorcado.getSaldo());
                    
                    System.out.println("1. Volver a jugar");
                    System.out.println("2. Volver al incio");
                    System.out.println("Digite el numero de la opcion?");
                    volver = scanner.nextInt();
                    if (volver == 1){
                        
                        while(volver == 1){
                            
                            juegoAhorcado.jugar();
                            System.out.println("SALDO FINAL: " + juegoAhorcado.getSaldo());
                            
                            System.out.println("1. Volver a jugar");
                            System.out.println("2. Volver al incio");
                            System.out.println("Digite el numero de la opcion?");
                            volver = scanner.nextInt();
                        }
                    }
                    
                    else {
                        
                        break;
                    }
                    juegoAdivinarNumero.setSaldo(juegoAhorcado.getSaldo());
                    int totalSaldo;
                    break;
                    
                case 3:
                    System.out.println("¡Gracias por jugar!");
                    return;
                    
                default:
                    System.out.println("¡Opción inválida! Por favor, elige una opción válida.");
            }
        }
    }
}
