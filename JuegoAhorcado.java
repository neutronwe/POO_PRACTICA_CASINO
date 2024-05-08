
package com.mycompany.practicapoocasino;
import java.util.Random;
import java.util.Scanner;


public class JuegoAhorcado extends Juegos{  
    
    private String[] palabras = {"programacion", "computadora", "java", "openai", "inteligencia", "artificial", "aprendizaje", "automatico"};
    private String palabraSecreta;
    private StringBuilder palabraAdivinada;
    private int intentosRestantes;
    private Scanner scanner;

    public JuegoAhorcado() {
        Random random = new Random();
        scanner = new Scanner(System.in);
        palabraSecreta = palabras[random.nextInt(palabras.length)];
        palabraAdivinada = new StringBuilder("_".repeat(palabraSecreta.length()));
        intentosRestantes = 6; // Número de intentos permitidos
    }
    
    @Override
    protected void jugar() {
        
        System.out.println("---------JUEGO EL AHORCADO---------");
        System.out.print("Introduce el valor que vas a apostar: ");
        valorApuesta = scanner.nextInt();

        while (intentosRestantes > 0 && palabraAdivinada.indexOf("_") != -1) {
            
            System.out.println("Palabra: " + palabraAdivinada);
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Introduce una letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraAdivinada.setCharAt(i, letra);
                    acierto = true;
                }
            }

            if (!acierto) {
                System.out.println("La letra no está en la palabra.");
                intentosRestantes--;
            }
        }

        if (intentosRestantes > 0) {
            System.out.println("¡Felicidades! ¡Has adivinado la palabra!");
            
            saldo += valorApuesta * 2;
            System.out.println("GANASTE: " + valorApuesta*2);
            System.out.println("SALDO FINAL: " + saldo);
            
            
        } else {
            System.out.println("¡Has agotado tus intentos! La palabra secreta era: " + palabraSecreta);
            
            saldo -=  valorApuesta;
            System.out.println("PERDISTE: " + valorApuesta);
            System.out.println("SALDO FINAL: " + saldo);
        }
        
        Random random = new Random();
        scanner = new Scanner(System.in);
        palabraSecreta = palabras[random.nextInt(palabras.length)];
        palabraAdivinada = new StringBuilder("_".repeat(palabraSecreta.length()));
        intentosRestantes = 6; // Número de intentos permitidos
    }
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

