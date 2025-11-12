import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ahorcado dibujo = new ahorcado();
        palabras lista = new palabras();

        String palabra = lista.obtenerPalabraAleatoria();
        String progreso = "";
        int errores = 0;
        final int MAX_ERRORES = 6;

        Set<String> letrasUsadas = new HashSet<>();

        // Rellenar progreso con guiones bajos
        for (int i = 0; i < palabra.length(); i++) {
            progreso += "_";
        }

        System.out.println("Bienvenido al juego del Ahorcado!");
        System.out.println("La palabra tiene " + palabra.length() + " letras.");

        while (errores < MAX_ERRORES) {
            System.out.println();
            dibujo.mostrarAhorcado(errores);
            System.out.print("Palabra: ");
            for (int i = 0; i < progreso.length(); i++) {
                System.out.print(progreso.charAt(i) + " ");
            }
            System.out.println();

            // Mostrar letras ya usadas
            if (!letrasUsadas.isEmpty()) {
                System.out.println("Letras usadas: " + letrasUsadas);
            }

            System.out.print("Introduce una letra: ");
            String entrada = sc.nextLine().toLowerCase();

            if (entrada.length() != 1) {
                System.out.println("Solo puedes escribir una letra.");
                continue;
            }

            String letra = entrada;

            // Comprobamos si la letra ya se ha usado
            if (letrasUsadas.contains(letra)) {
                System.out.println("Ya has utilizado esta letra anteriormente.");
                continue; // no se penaliza ni repite
            }

            // Añadir la letra a las usadas
            letrasUsadas.add(letra);

            boolean acierto = false;
            String nuevoProgreso = "";

            // Construimos la nueva cadena con las letras acertadas
            for (int i = 0; i < palabra.length(); i++) {
                String letraPalabra = String.valueOf(palabra.charAt(i));
                if (letraPalabra.equals(letra)) {
                    nuevoProgreso += letra;
                    acierto = true;
                } else {
                    nuevoProgreso += progreso.charAt(i);
                }
            }

            progreso = nuevoProgreso;

            if (!acierto) {
                errores++;
                System.out.println("La letra no está. Te quedan " + (MAX_ERRORES - errores) + " intentos.");
            } else {
                System.out.println("Bien hecho!");
            }

            if (!progreso.contains("_")) {
                System.out.println("\nHas ganado! La palabra era: " + palabra);
                break;
            }
        }

        if (errores == MAX_ERRORES) {
            dibujo.mostrarAhorcado(errores);
            System.out.println("\nHas perdido 💀. La palabra era: " + palabra);
        }

        sc.close();
    }
}
