package Ejercicios;

import java.util.Scanner;

public class PocionesMana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pocionesMisiones = 5;

        System.out.print("¿Cuantos hechizos gastas por batalla?");
        int hechizosBatallas = sc.nextInt();

        System.out.print("¿Cuantas batallas forman cada misión?");
        int numeroBatallas = sc.nextInt();

        System.out.print("¿Cuantas misiones hay en un nivel?");
        int numeroMisiones = sc.nextInt();

        int totalPociones = (hechizosBatallas * numeroBatallas * numeroMisiones) / pocionesMisiones;

        System.out.println("Pociones necesarias: " + totalPociones);
    }
}
