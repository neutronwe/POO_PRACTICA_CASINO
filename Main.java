package com.mycompany.practicapoocasino;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        JuegoAdivinarNumero juegoAdivinarNumero = new JuegoAdivinarNumero();
        JuegoAhorcado juegoAhorcado = new JuegoAhorcado();

        while (true) {
            System.out.println("                                                     ");
            System.out.println(" -------------------INICIO CASINO------------------- ");
            System.out.println("|                                                   |");
            
            int aux = juegoAdivinarNumero.getSaldo();
            int aux2 = juegoAhorcado.getSaldo();
            
            if (aux == 0 || aux2 == 0){
                
                System.out.print("| INGRESA EL SALDO PARA JUGAR: ");
                juegoAdivinarNumero.setSaldo(scanner.nextInt());
                juegoAhorcado.setSaldo(juegoAdivinarNumero.getSaldo());
                System.out.println(" --------------------------------------------------- ");  
                
                while (juegoAdivinarNumero.getSaldo() == 0){
                    
                    System.out.println("                                                     ");
                    System.out.println(" --------------------------------------------------- ");  
                    System.out.println("|                                                   |");
                    System.out.println("| EL SALDO DEBE SER MAYOR A 0!!!!                   |");
                    System.out.print  ("| INGRESE DE NUEVO EL SALDO: ");
                    juegoAdivinarNumero.setSaldo(scanner.nextInt());
                    juegoAhorcado.setSaldo(juegoAdivinarNumero.getSaldo());
                    System.out.println(" --------------------------------------------------- ");
                }
            }
            
            System.out.println("|                                                   |");
            System.out.println("| SU SALDO ES: " + juegoAdivinarNumero.getSaldo());
            System.out.println("|                                                   |");
            System.out.println("| 1. Juego Adivina el numero                        |");
            System.out.println("| 2. Juego El Ahorcado                              |");
            System.out.println("| 3. Salir                                          |");
            System.out.println("|                                                   |");
            System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
            int opcion = scanner.nextInt();
            System.out.println(" --------------------------------------------------- ");
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()
            
            

            switch (opcion) {
                case 1:
                    
                    juegoAdivinarNumero.setSaldo(juegoAhorcado.getSaldo());
                    
                    juegoAdivinarNumero.jugar();
                    
                    juegoAhorcado.setSaldo(juegoAdivinarNumero.getSaldo());
                    
                    System.out.println("                                                     ");
                    System.out.println(" --------------------------------------------------- ");
                    System.out.println("|                                                   |");
                    System.out.println("| SALDO FINAL: " + juegoAdivinarNumero.getSaldo());
                    System.out.println(" --------------------------------------------------- ");
                    
                    while (juegoAdivinarNumero.getSaldo() == 0) {

                        System.out.println("|                                                   |");
                        System.out.println("| COMO SU SALDO AHORA ES: 0                         |");
                        System.out.println("|                                                   |");
                        System.out.println("| 1. Ingrese nuevo saldo si quiere volver a jugar   |");
                        System.out.println("|                                                   |");
                        System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
                        int volver = scanner.nextInt();
                        System.out.println(" --------------------------------------------------- ");
                        
                        if (volver == 1) {

                            while (juegoAdivinarNumero.getSaldo() == 0) {

                                System.out.println("|                                                   |");
                                System.out.print  ("| INGRESE UN SALDO MAYOR A 0: ");
                                juegoAdivinarNumero.setSaldo(scanner.nextInt());
                                juegoAhorcado.setSaldo(juegoAdivinarNumero.getSaldo());
                                System.out.println(" --------------------------------------------------- ");
                            }
                        } else {

                            break;
                        }
                    }
                    
                    System.out.println("|                                                   |");
                    System.out.println("| 1. Volver a jugar                                 |");
                    System.out.println("| 2. Volver al incio                                |");
                    System.out.println("|                                                   |");
                    System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
                    int volver = scanner.nextInt();
                    System.out.println(" --------------------------------------------------- ");
                    
                    
                    if (volver == 1){
                        
                        while (volver == 1) {

                            juegoAdivinarNumero.jugar();
                            System.out.println("                                                     ");
                            System.out.println(" --------------------------------------------------- ");
                            System.out.println("|                                                   |");
                            System.out.println("| SALDO FINAL: " + juegoAdivinarNumero.getSaldo());
                            System.out.println(" --------------------------------------------------- ");

                            while (juegoAdivinarNumero.getSaldo() == 0) {

                                System.out.println("|                                                   |");
                                System.out.println("| COMO SU SALDO AHORA ES: 0                         |");
                                System.out.println("|                                                   |");
                                System.out.println("| 1. Ingrese nuevo saldo si quiere volver a jugar   |");
                                System.out.println("|                                                   |");
                                System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
                                volver = scanner.nextInt();
                                System.out.println(" --------------------------------------------------- ");
                                
                                if (volver == 1) {

                                    while (juegoAdivinarNumero.getSaldo() == 0) {

                                        System.out.println("|                                                   |");
                                        System.out.println("| INGRESE UN SALDO MAYOR A 0: ");
                                        juegoAdivinarNumero.setSaldo(scanner.nextInt());
                                        juegoAhorcado.setSaldo(juegoAdivinarNumero.getSaldo());
                                        System.out.println(" --------------------------------------------------- ");
                                    }
                                } else {

                                    break;
                                }
                            }
                            
                            System.out.println("|                                                   |");
                            System.out.println("| 1. Volver a jugar                                 |");
                            System.out.println("| 2. Volver al incio                                |");
                            System.out.println("|                                                   |");
                            System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
                            volver = scanner.nextInt();
                            System.out.println(" --------------------------------------------------- ");
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
                    
                    juegoAdivinarNumero.setSaldo(juegoAhorcado.getSaldo());
                    
                    System.out.println("                                                     ");
                    System.out.println(" --------------------------------------------------- ");
                    System.out.println("|                                                   |");
                    System.out.println("| SALDO FINAL: " + juegoAhorcado.getSaldo());
                    System.out.println(" --------------------------------------------------- ");
                    
                    while (juegoAhorcado.getSaldo() == 0) {

                        System.out.println("|                                                   |");
                        System.out.println("| COMO SU SALDO AHORA ES: 0                         |");
                        System.out.println("|                                                   |");
                        System.out.println("| 1. Ingrese nuevo saldo si quiere volver a jugar   |");
                        System.out.println("|                                                   |");
                        System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
                        volver = scanner.nextInt();
                        System.out.println(" --------------------------------------------------- ");

                        if (volver == 1) {

                            while (juegoAhorcado.getSaldo() == 0) {

                                System.out.println("|                                                   |");
                                System.out.println("| INGRESE UN SALDO MAYOR A 0: ");
                                juegoAhorcado.setSaldo(scanner.nextInt());
                                juegoAdivinarNumero.setSaldo(juegoAhorcado.getSaldo());
                                System.out.println(" --------------------------------------------------- ");
                            }
                        } else {

                            break;
                        }
                    }
                    
                    System.out.println("|                                                   |");
                    System.out.println("| 1. Volver a jugar                                 |");
                    System.out.println("| 2. Volver al incio                                |");
                    System.out.println("|                                                   |");
                    System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
                    volver = scanner.nextInt();
                    System.out.println(" --------------------------------------------------- ");
                    
                    if (volver == 1){
                        
                        while(volver == 1){
                            
                            juegoAhorcado.jugar();
                            System.out.println("                                                     ");
                            System.out.println(" --------------------------------------------------- ");
                            System.out.println("|                                                   |");
                            System.out.println("| SALDO FINAL: " + juegoAhorcado.getSaldo());
                            System.out.println(" --------------------------------------------------- ");
                            
                            while (juegoAdivinarNumero.getSaldo() == 0) {

                                System.out.println("|                                                   |");
                                System.out.println("| COMO SU SALDO AHORA ES: 0                         |");
                                System.out.println("|                                                   |");
                                System.out.println("| 1. Ingrese nuevo saldo si quiere volver a jugar   |");
                                System.out.println("|                                                   |");
                                System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
                                volver = scanner.nextInt();
                                System.out.println(" --------------------------------------------------- ");
                                
                                if (volver == 1) {

                                    while (juegoAhorcado.getSaldo() == 0) {

                                        System.out.println("|                                                   |");
                                        System.out.println("| INGRESE UN SALDO MAYOR A 0: ");
                                        juegoAhorcado.setSaldo(scanner.nextInt());
                                        juegoAdivinarNumero.setSaldo(juegoAhorcado.getSaldo());
                                        System.out.println(" --------------------------------------------------- ");
                                    }
                                } else {

                                    break;
                                }
                            }
                            
                            System.out.println("|                                                   |");
                            System.out.println("| 1. Volver a jugar                                 |");
                            System.out.println("| 2. Volver al incio                                |");
                            System.out.println("|                                                   |");
                            System.out.print  ("| DIGITE EL NUMERO DE LA OPCION: ");
                            volver = scanner.nextInt();
                            System.out.println(" --------------------------------------------------- ");
                        }
                    }
                    
                    else {
                        
                        break;
                    }
                    juegoAdivinarNumero.setSaldo(juegoAhorcado.getSaldo());
                    int totalSaldo;
                    break;
                    
                case 3:
                    
                    System.out.println("|                                                   |");
                    System.out.println("| GRACIAS POR JUGAR!!! :)                           |");
                    System.out.println(" --------------------------------------------------- ");

                    
                    return;
                    
                default:
                    System.out.println("|                                                   |");
                    System.out.println("| OPCION INVALIDA!!!!                               |");
                    System.out.println("| ELIJA UN OPCION VALIDA                            |");
                    System.out.println(" --------------------------------------------------- ");

            }
        }
    }
}
